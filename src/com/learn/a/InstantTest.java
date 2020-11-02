package com.learn.a;

import org.junit.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * @author admin
 * @create 2020/10/15
 */
public class InstantTest {

    @Test
    public void Test() {
        //Instant(long, int)' has private access in 'java.time.Instant
        //now()  获得当前时间本初子午线
        Instant now = Instant.now();
        Instant instant = Instant.ofEpochMilli(1602774857667L);
        System.out.println(now);
        System.out.println(instant);
        // date.getTime 相当于 getEpochMilli
        //返回毫秒
        System.out.println(now.getEpochSecond());
        //toEpochMilli
        System.out.println("+++++++++++++++");
        /**
         * > getEpochSecond()表示仅仅是getter,即它只返回存储在该实例中的值
         * 另一方面,> toEpochMilli()会计算其返回值,就像toString()不会返回存储的字符串,但每次调用该方法时都会在运行中构建
         */
        //获取 从1970-01-01到now的毫秒数
        System.out.println(now.toEpochMilli());
        System.out.println(now.getEpochSecond());
        System.out.println("+++++++++++++++");

        //偏移量  add  2020-10-15T15:14:17.667Z atOffset-> 2020-10-15T23:14:17.667+08:00
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHoursMinutesSeconds(4, 10, 23));
        OffsetDateTime offsetDateTime1 = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(instant + " atOffset-> " + offsetDateTime);
        System.out.println(instant + " atOffset-> " + offsetDateTime1);

        System.out.println(offsetDateTime.toInstant());
    }
}
