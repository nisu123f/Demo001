package com.learn.e;

/**
 * 定义一个 Employee 类。
 * 该类包含：private 成员变量 name,age,birthday，
 * 其中 birthday 为 MyDate 类的对象；
 * 并为每一个属性定义 getter, setter 方法；
 * 并重写 toString 方法输出 name, age, birthday
 * 使 Employee 实现 Comparable 接口，并按 name 排序
 * @author admin
 * @create 2020/10/18
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private Integer age;
    private MyDate birthday;

    public Employee(String name, Integer age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday.getYear() + "-" +
                birthday.getMonth() + "-" +
                birthday.getDay() +
        '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }

//    @Override
//    public int compareTo(Object o) {
//        //o ? Employee
//        if (o instanceof Employee) {
//            //是
//            Employee employee = (Employee) o;
//            //按 name 排序
//            return this.name.compareTo(employee.name);
//        }
//        throw new RuntimeException("传入参数有误");
//    }
}
