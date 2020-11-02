package com.learn.l;

/**
 * @author admin
 * @create 2020/10/26
 */
public class Persion {

    String name;
    private Integer age;

    public void play() {
        System.out.println("w");
    }

    public Persion() {
    }

    public Persion(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
