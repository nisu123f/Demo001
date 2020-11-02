package com.learn.b;

/**
 * @author admin
 * @create 2020/10/24
 */
public enum MyWeek {
    //周日
    Sunday(0),
    //周1
    Monday(1),
    //周2
    Tuesday(2),
    //周3
    Wednesday(3),
    //周4
    Thursday(4),
    //周5
    Friday(5),
    //周6
    Saturday(6);

    private Integer value;

    MyWeek() {
    }

    MyWeek(Integer value) {
        this.value = value;
    }

    public static MyWeek getWeek(Integer value) {
        for (MyWeek week : MyWeek.values()) {
            if (week.equals(week)) {
                return week;
            }
        }
        return null;
    }
}
