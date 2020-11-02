package com.learn.m;

/**
 * @author admin
 * @create 2020/10/26
 */
public class StarProxyTest {
    public static void main(String[] args) {
        Singer singer = new Singer();
        ProxyStar proxyStar = new ProxyStar(singer);
        proxyStar.show();

        System.out.println();

        Dancer dancer = new Dancer();
        ProxyStar proxyStar1 = new ProxyStar(dancer);
        proxyStar1.show();


    }
}

interface Star {
    void show();
}

//被代理方
class Singer implements Star {
    @Override
    public void show() {
        System.out.println("我是歌星xx,我来给你们唱首歌");
    }
}

//被代理方
class Dancer implements Star {
    @Override
    public void show() {
        System.out.println("我来个大家跳个舞");
    }
}

//代理方
class ProxyStar implements Star {
    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void show() {
        System.out.println("马上准备好,xx马上可以上台表演了");

        star.show();

        System.out.println("下边交给我了");


    }
}
