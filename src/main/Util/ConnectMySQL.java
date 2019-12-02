package main.Util;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {


    public static java.sql.Connection Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(Settings.jdbc, Settings.dbUser, Settings.dbPwd);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
