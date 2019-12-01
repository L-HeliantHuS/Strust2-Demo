package main.Util;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
    static final String jdbc = "jdbc:mysql://docker:3306/jdbc?useSSL=false&serverTimezone=UTC";
    static final String dbUser = "root";
    static final String dbPwd = "1984441370";

    public static java.sql.Connection Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(jdbc, dbUser, dbPwd);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
