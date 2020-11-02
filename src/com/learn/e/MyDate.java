package com.learn.e;

/**
 * MyDate 类包含:
 * private 成员变量 year,month,day；
 * 并为每一个属性定义 getter, setter
 * 方法；
 * @author admin
 * @create 2020/10/18
 */
public class MyDate implements Comparable<MyDate>{
    private Integer year;
    private Integer month;
    private Integer day;

    public MyDate(Integer year, Integer month, Integer day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int yearCompare = year.compareTo(o.getYear());
        if (yearCompare == 0) {
            int monthCompare = month.compareTo(o.getMonth());
            if (monthCompare == 0) {
                return year.compareTo(o.getDay());
            }
            return monthCompare;
        }
        return yearCompare;
    }
}
