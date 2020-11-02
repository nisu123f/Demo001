package com.learn.a;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @author admin
 * @create 2020/10/16
 */
public class DateTimeFormatTest {

    @Test
    public void test() {
        //1.实例化-1
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //实例化-2
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //实例化-3  自定义 - 优选
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        //格式化  --  日期 -> 字符串
        LocalDateTime localDateTime = LocalDateTime.now();

        String str1 = isoLocalDateTime.format(localDateTime);
        String str = dateTimeFormatter.format(localDateTime);
        String str2 = dateTimeFormatter1.format(localDateTime);


        System.out.println("localDateTime  " + localDateTime);
        System.out.println("str  " + str);
        System.out.println("str1  " + str1);

        //解析  --  字符串 -> 日期
        TemporalAccessor parse = isoLocalDateTime.parse("2020-10-16T08:55:54.314");
        System.out.println(parse);

        TemporalAccessor parse1 = dateTimeFormatter1.parse("2020-10-16 08:55:54");
        System.out.println(parse1);

        System.out.println("_______________________________________________________");
        //重点方式(三)  ofPattern()
        //--创建--
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateTimeFormatter2);
        //--格式化--
        String format = dateTimeFormatter2.format(LocalDateTime.now());
        System.out.println(format);

        //--解析--
        TemporalAccessor parse2 = dateTimeFormatter2.parse("2020-10-16 09:29:04");
        System.out.println(parse2);


    }
}
