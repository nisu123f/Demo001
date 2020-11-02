package com.learn.a;


/**
 * @author admin
 * @create 2020/10/24
 */
public class EnumSwitchTest {
    public static void main(String[] args) {
        DateType dateType = DateType.getType("day");

        //根据枚举判断，给tableName，和condition赋予不同场景下的不同值
        switch(dateType) {
            case HOUR:
                System.out.println("hour");
                break;
            case DAY:
                System.out.println("day");
                break;
            case WEEK:
                System.out.println("week");
                break;
            case MONTH:
                System.out.println("month");
                break;
            case YEAR:
                System.out.println("year");
                break;
            default :
                System.out.println("default");
        }

    }
}
