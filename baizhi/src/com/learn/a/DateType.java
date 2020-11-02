package com.learn.a;

/**
 * @author admin
 * @create 2020/10/24
 */
public enum DateType {
    /**小时类型值**/
    HOUR("hour"),
    /**小时类型值**/
    DAY("day"),
    /**小时类型值**/
    WEEK("week"),
    /**小时类型值**/
    MONTH("month"),
    /**小时类型值**/
    YEAR("year"),
    /**小时类型值**/
    MINUTE("minute");

    private String value;


    DateType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static DateType getType(String dateTypeCode) {
        for(DateType enums:DateType.values()){
            if(enums.value.equals(dateTypeCode)){
                return enums;
            }
        }
        return null;
    }
}
