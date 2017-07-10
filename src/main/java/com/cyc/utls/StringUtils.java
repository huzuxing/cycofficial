package com.cyc.utls;

/**
 * Created by huzuxing on 2017/7/4.
 */
public class StringUtils {

    public static boolean isNullOrEmpty(String str) {
        return "".equals(str) || null == str;
    }
}
