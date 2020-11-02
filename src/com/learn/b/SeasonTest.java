package com.learn.b;

import java.util.Arrays;

/**
 *jdk5.0之前自定义枚举类
 * @author admin
 * @create 2020/10/16
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN.getSeasonDesc());
        System.out.println(Season.SUMMER);
        System.out.println("------Enum的toString()被重写过--------");
        System.out.println(Season1.AUTUMN);
        System.out.println(Season1.AUTUMN.getSeasonDesc());

        System.out.println("++++++ values() +++++++");
        Season1[] values = Season1.values();
        System.out.println(Arrays.toString(values));

        System.out.println(".........valueOf()....找到返回名字 没有的话抛出异常.....");
        Season1 summer = Season1.valueOf("SUMMER");
        System.out.println("summer = " + summer);

        System.out.println("====== Thread.state.values() =========");
        Thread.State[] values1 = Thread.State.values();
        System.out.println(Arrays.toString(values1));

        System.out.println("-------implements --------");
        Season1.AUTUMN.show();


    }

}

class Season {
    //1.属性 私有final
    private final String seasonName;
    private final String seasonDesc;


    //2.私有化类的构造器
    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举类的多个方法 ---  public static final
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "寒风刺骨");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';

    }
}

/**
 * Enum可以实现接口
 */
enum Season1 implements Info {

    //3.提供当前枚举类的多个方法 ---  public static final 不再使用

    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天到了,夏天还会远吗");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏天到了,秋天还会远吗");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天到了,冬天还会远吗");
        }
    },
    WINTER("冬天", "寒风刺骨"){
        @Override
        public void show() {
            System.out.println("冬天到了,你还要盼春天吗");
        }
    };

    //1.属性 私有final
    private final String seasonName;
    private final String seasonDesc;


    //2.私有化类的构造器
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


//    @Override
//    public void show() {
//
//    }

    //ke不再重写toString
//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}

 interface Info {
    abstract public void show();
}
