package main.Util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class CalcMD5 {
    // Calc 计算字符串的MD5值
    public static String Calc(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // 进行加盐操作
        text += Settings.SecretKey;

        // 生成MD5字节 并转换为字符串返回
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(text.getBytes(StandardCharsets.UTF_8));
        return new BigInteger(1, instance.digest()).toString(16);
    }
}
