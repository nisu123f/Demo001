package com.learn.a;

import org.junit.Test;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.util.Date;


/**
 * @author admin
 * @create 2020/10/15
 */
public class JodaTest {

    @Test
    public void test1() {
        // 1991-01-01  的偏移量
        Date date = new Date(2020, 12, 34);
        System.out.println(date);
    }

    @Test
    public void test(){
        // jdk8.0 新增 -- 整合 joda
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();

        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);

        // LocalDate(int, int, int)' has private access in 'java.time.LocalDate
        //不能直接使用 new LocalDate() 而是使用 LocalDate.of()
//        LocalDate localDate = new LocalDate(2020, 12, 34);

        //of()
        LocalDate localDate = LocalDate.of(2018, 2, 28);
//        java.time.DateTimeException: Invalid date 'February 29' as '2018' is not a leap year
        //二月 29 ? 28

        System.out.println(localDate);

        //getXx()
        System.out.println(now.getYear());
                //FEBRUARY
        System.out.println(localDate.getMonth());
                //2
        System.out.println(localDate.getMonthValue());
                //WEDNESDAY    没有输出 数字的方法
        System.out.println(localDate.getDayOfWeek());

        System.out.println(localDate.getDayOfMonth());
        System.out.println(now2.getSecond());

        //withXx()  set
        LocalDate localDate1 = now.withDayOfMonth(12);
           //不可变性
        System.out.println(now);
        System.out.println(localDate1);

        //  加减操作  --  虽然有单独的方法  但是仍可以传入负数,使加减方法互换
        // plusXx()   add
        LocalDate localDate2 = localDate1.plusDays(12);
        System.out.println(localDate1 + " plus-> " + localDate2);

        LocalDate localDate21 = localDate1.plusDays(-12);
        System.out.println(localDate1 + " plus-> " + localDate21);


        // minusXx()  sub
        LocalDate localDate3 = localDate2.minusDays(12);
        System.out.println(localDate2 + " minus-> " + localDate3);

        LocalDate localDate31 = localDate2.minusDays(-12);
        System.out.println(localDate2 + " minus-> " + localDate31);
    }
}
