package com.learn.a;


import jdk.nashorn.internal.parser.Scanner;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author admin
 * @create 2020/10/15
 */
public class SimpleDataTest {

    @Test
    public void simpleTest() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        Date date = new Date();
        System.out.println(date);

        String format = simpleDateFormat.format(date);
        System.out.println(format);

        System.out.println("**************************");
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd 'T' HH:mm:ss:SSS'Z'");
        String format1 = simple.format(date);
        System.out.println(format1);

    }

    /**
     * " " 转 sql中的date
     */
    @Test
    public void test1() throws ParseException {
        String birthday = "2020-12-23";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date = simpleDateFormat.parse(birthday);
        java.sql.Date birthdayDate = new java.sql.Date(date.getTime());
        System.out.println(birthdayDate);
    }


    /**
     * 三天打鱼两天晒网   从 1990-01-01 到 xxxx-xx-xx 打鱼?晒网
     */
    @Test
    public void test2() throws ParseException {
        String year = "2029";
        String month = "12";
        String day = "16";

        String dateNow = year + "-" + month + "-" + day;
        String dateBefore = "1990-01-01";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date parseNow = simpleDateFormat.parse(dateNow);
        System.out.println(parseNow);
        Date parseBefore = simpleDateFormat.parse(dateBefore);
        System.out.println(parseBefore);

        long totalDays = (parseNow.getTime() - parseBefore.getTime()) / (1000 * 60 * 60 * 24) + 1;
        System.out.println(totalDays);
        long n = totalDays % 5;
        System.out.println(n);
        if ( n == 1 || n == 2 || n == 3){
            System.out.println("打鱼");
        }else if ( n == 0 || n == 4){
            System.out.println("晒网");
        }


    }



}
