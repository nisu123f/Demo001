package com.learn.a;

import sun.security.util.Length;

/**
 * @author admin
 * @create 2020/10/14
 */
public class ResStringBuilder {




    public static StringBuilder resStringBuilder(StringBuilder stringBuilder, int start, int end) {
        if( stringBuilder.length() < start || stringBuilder.length() < end ){
            System.out.println("outOfIndexBound");
            return null;


        }else {
            StringBuilder stringBuilder1 = new StringBuilder().append(stringBuilder.toString());

            StringBuilder reverse = stringBuilder1.delete(0, start).delete(end - start, stringBuilder1.length()).reverse();
            return stringBuilder.replace(start, end, "qt");
        }
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("qwertqweqweqwe");
        System.out.println(resStringBuilder2(stringBuilder, 3, 7));
    }

    public static StringBuilder resStringBuilder1(StringBuilder stringBuilder, int start, int end) {
        if( stringBuilder.length() < start || stringBuilder.length() < end ){
            System.out.println("outOfIndexBound");
            return null;


        }else {
            String startStr = stringBuilder.substring(0, start);
            String middleStr = stringBuilder.substring(start, end);
            String midResStr = new StringBuilder(middleStr).reverse().toString();
            String endStr = stringBuilder.substring(end, stringBuilder.length());
            return new StringBuilder(startStr + midResStr + endStr);
        }
    }


    public static StringBuilder resStringBuilder2(StringBuilder stringBuilder, int start, int end) {
        if( stringBuilder.length() < start || stringBuilder.length() < end ){
            System.out.println("outOfIndexBound");
            return null;

        }else {
            String middleStr = stringBuilder.substring(start, end);
            String midResStr = new StringBuilder(middleStr).reverse().toString();
            return stringBuilder.replace(start, end, midResStr);
        }
    }
}
