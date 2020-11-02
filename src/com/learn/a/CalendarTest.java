package com.learn.a;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author admin
 * @create 2020/10/15
 */
public class CalendarTest {
  //Calendar是一个抽象类
    @Test
    public void calTest() {
        //日历对象的创建 -- Calendar是一个抽象类 不能直接new
        //下边两种方法  --   1.调用方法   2.new 实现类
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = new GregorianCalendar();
        //两者结果一样   -- 很长一串
        System.out.println(calendar);
        System.out.println(calendar1);

        // get()
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set()
        calendar1.set(Calendar.DAY_OF_MONTH, 12);
        System.out.println(calendar1.get(Calendar.DAY_OF_MONTH));

        //add()   amount负数时减去相应的天数
        calendar1.add(Calendar.DAY_OF_MONTH, 4);
        calendar1.add(Calendar.DAY_OF_MONTH, -4);
        System.out.println(calendar1.get(Calendar.DAY_OF_MONTH));

        //getTime()  --   Calendar -> Date
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime()  --    Date -> Calendar
        Date date1 = new Date();
        calendar.setTime(date1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }


    /**
     * 三天打鱼两天晒网   从 1990-01-01 到 xxxx-xx-xx 打鱼?晒网
     */
    @Test
    public void test2() throws ParseException {
        //1.  String -> Date  -> Calendar
        //2.  years * 365(366) + calendar.get(Calendar.DAY_OF_Year)
        String year = "2029";
        String month = "12";
        String day = "16";

        String dateNow = year + "-" + month + "-" + day;
        String dateBefore = "1990-01-01";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date parseNow = simpleDateFormat.parse(dateNow);
        System.out.println(parseNow);

//        Calendar calendar = Calendar.getInstance();
        Calendar calendarNow = new GregorianCalendar();
        calendarNow.setTime(parseNow);


        Date parseBefore = simpleDateFormat.parse(dateBefore);
        System.out.println(parseBefore);

        String yearBefore = dateBefore.substring(0, 4);
        int intYearNow = Integer.parseInt(year);
        int intYearBefore = Integer.parseInt(yearBefore);

        //闰年 - 1992年是闰年
        int years = intYearNow - intYearBefore;
        int leapYears = (intYearNow - 1992) / 4 + 1;

        int days = years * 365 + leapYears;

        int totalDays = days + calendarNow.get(Calendar.DAY_OF_YEAR);




        long n = totalDays % 5;
        System.out.println(n);
        if ( n == 1 || n == 2 || n == 3){
            System.out.println("打鱼");
        }else if ( n == 0 || n == 4){
            System.out.println("晒网");
        }

    }
}
