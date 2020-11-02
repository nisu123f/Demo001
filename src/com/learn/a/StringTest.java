package com.learn.a;

import java.util.Arrays;


/**
 * @author admin
 * @create 2020/10/14
 */
public class StringTest {

    public static void main(String[] args) {
        System.out.println("-----myTrim------" + myTrim("  ") + "=----------");
//        System.out.println("----------" + reverse(" Hello world") + "----------");
        System.out.println("----------" + SubCount2(" Hello ll worlld", "ll") + "----------");
        System.out.println("----------" + SubMax(" Hello ll worlld", "l dgroellollodsfg") + "----------");
    }

    public static String myTrim(String str) {
        if(str != null){
            int len = str.length();
            System.out.println(Arrays.toString(str.toCharArray()));
            char[] chars = str.toCharArray();

            int i = 0;
            int j = len - 1;
            while (i < j && chars[i] == ' ') {
                i++;
            }

            if (i == j) {
                return "";
            }


            while (i < j && chars[j] == ' ') {
                j--;
            }
            return str.substring(i, j+1);
        }
        return null;

    }

    public static String reverse(String str) {
        if (str != null) {
            char[] chars = str.toCharArray();
            int len = chars.length;
            for (int i = 0; i < len / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[len - 1 - i];
                chars[len - 1 - i] = temp;
            }
            return new String(chars);
        }
        return null;
    }

//    public static int SubCount(String str, String subStr) {
//        int slen = subStr.length();
//        int count = -1;
//        int index = 0;
//        while (index != -1) {
//            count++;
//            index = str.indexOf(subStr);
//            /*
//            * 当匹配子串在字符串最后且大于2字符时(只有一个字符时 index + slen = -1 + 1 = 0),经过上一次切割str,已使其为空串
//            * 而此时的index为-1 但是slen却是很大的值,两者之和为正值,切割字符串时会超出索引值.
//            *
//            * */
////            if (str.isEmpty()) {
////                break;
////            }
//            str = str.substring(index + slen);
//            //由于上述原因,加上下边代码.
//            if (str.isEmpty()) {
//                break;
//            }
//
//        }
//        return count;
//    }

    public static int SubCount1(String str, String subStr) {
        int index = 0;
        int count = 0;
        while ((index = str.indexOf(subStr,index)) != -1){
            index += subStr.length();
            count ++;
        }
        return count;
    }


    public static int SubCount2(String str, String subStr) {
        int slen = subStr.length();
        int count = -1;
        int index = 0;
        while (index != -1) {
            count++;
            index = str.indexOf(subStr,(index + slen));
            /*
             * 当匹配子串在字符串最后且大于2字符时(只有一个字符时 index + slen = -1 + 1 = 0),经过上一次切割str,已使其为空串
             * 而此时的index为-1 但是slen却是很大的值,两者之和为正值,切割字符串时会超出索引值.
             *
             * */
//            if (str.isEmpty()) {
//                break;
//            }
//            str = str.substring(index + slen);
            //由于上述原因,加上下边代码.
            if (str.isEmpty()) {
                break;
            }

        }
        return count;
    }


    public static String SubMax(String str, String subStr) {
        int slen = subStr.length();
        String subString = null;
        for (int i = slen; i > 0; i--) {
            for (int j = 0; j < slen - i; j++) {
                subString = subStr.substring(j, j+i+1);
                if (str.contains(subString)){
                    return subString;
                }
            }
        }
        return subString;
    }

    public static String SubMax1(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String str = str1.length() > str2.length() ? str1 : str2;
            String subStr = str1.length() < str2.length() ? str1 : str2;
            int slen = subStr.length();
            String subString = null;
            for (int i = slen; i > 0; i--) {
                for (int j = 0; j < slen - i; j++) {
                    subString = subStr.substring(j, j+i+1);
                    if (str.contains(subString)){
                        return subString;
                    }
                }
            }
            return subString;
        }
        return null;
    }

    public static String StringSort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
