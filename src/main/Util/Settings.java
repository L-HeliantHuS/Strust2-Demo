package main.Util;

public class Settings {
    // 数据库配置
    static final String jdbc = "jdbc:mysql://docker:3306/jdbc?useSSL=false&serverTimezone=UTC";
    static final String dbUser = "root";
    static final String dbPwd = "1984441370";

    // 基础配置
    public final static int UserNameLenght = 16;
    public final static int PasswordLenght = 18;
    public final static String SecretKey = "HeliantHuS_iS_Awesome!!!";
}
