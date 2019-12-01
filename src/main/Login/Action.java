package main.Login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

public class Action {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String execute() throws Exception {
        String LoginStatus;
        // 初始化mysql实例
        Connection connect = ConnectMySQL.Connect();
        assert connect != null;
        Statement exec = connect.createStatement();

        // 构造sql并执行sql
        String sql = "select * from user where username = ? and password = ?;";
        System.out.println(sql);

        // JDBC自带防止SQL注入
        PreparedStatement preState = connect.prepareStatement(sql);
        preState.setString(1, username);
        preState.setString(2, password);
        ResultSet resultSet = preState.executeQuery();
        // 根据是否有下一条数据进行判断
        boolean isAvaiable = resultSet.next();
        if (isAvaiable) {

            Map attibutes = ActionContext.getContext().getSession();

            attibutes.put("username", username);

            LoginStatus = ActionSupport.SUCCESS;
        } else {
            LoginStatus = ActionSupport.INPUT;
        }
        return LoginStatus;
    }
}
