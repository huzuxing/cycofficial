package com.cyc.utls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by huzuxing on 2017/7/4.
 */
public class EncryptUtils {

    private static Logger log = LoggerFactory.getLogger(EncryptUtils.class);

    //保留混淆加密属性
    private static String defaultSalt;

    public static String encodePassword(String pwd) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("MD5");
            byte[] result = digest.digest(pwd.getBytes("UTF-8"));
            return byteArrayToHex(result);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String byteArrayToHex(byte[] array) {
        // 16进制字符
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        // 存放位运算后的结果
        char[] result = new char[array.length * 2];
        int index = 0;
        for(byte b : array) {
            result[index++] = hexDigits[b >>> 4 & 0xf];
            result[index++] = hexDigits[b & 0xf];
        }

        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(encodePassword("123456"));
    }
}
