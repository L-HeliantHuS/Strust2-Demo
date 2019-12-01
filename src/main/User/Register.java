package main.User;

import com.opensymphony.xwork2.ActionSupport;
import main.Util.CalcMD5;
import main.Util.ConnectMySQL;
import main.Util.Settings;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register {
    private String username;
    private String password;
    private String confirmPassword;
    private String ERROR;

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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String execute() throws NoSuchAlgorithmException, UnsupportedEncodingException, SQLException {
        // 判断长度
        if (username.length() > Settings.UserNameLenght || password.length() > Settings.PasswordLenght || confirmPassword.length() > Settings.PasswordLenght) {
            return ActionSupport.ERROR;
        }

        // 如果密码和确认密码不统一也直接返回ERROR
        if (!password.equals(confirmPassword)) {
            return ActionSupport.ERROR;
        }


        Connection connect = ConnectMySQL.Connect();
        assert connect != null;
        String sql = "insert into user (username, password) values (?, ?);";
        String cipherPwd = CalcMD5.Calc(password);

        PreparedStatement preparedStatement = connect.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, cipherPwd);
        boolean execStatus = preparedStatement.execute();
        if (execStatus) {
            return ActionSupport.SUCCESS;
        } else {
            ERROR = "创建用户失败.";
            return ActionSupport.ERROR;
        }
    }
}
