package com.learn.o;

import com.learn.e.Employee;
import com.learn.e.MyDate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author admin
 * @create 2020/10/30
 */
public class StreamApiTest {
    @Test
    public void test1 () {
        ArrayList<Employee> employee = new ArrayList<>();

        employee.add(new Employee("Tom", 18, new MyDate(2002, 2, 29)));
        employee.add(new Employee("Jim", 19, new MyDate(2001, 3, 29)));
        employee.add(new Employee("Acm", 18, new MyDate(2002, 1, 12)));
        employee.add(new Employee("Mon", 14, new MyDate(2006, 2, 29)));
        employee.add(new Employee("Jim", 20, new MyDate(2001, 3, 29)));

        Stream<Employee> stream = employee.stream();

        Stream<Employee> stream1 = employee.parallelStream();

        stream.filter(e -> e.getAge() > 18).limit(1).forEach(System.out :: println);
        //跳过前n个数
        stream1.filter(e -> e.getAge() > 18).skip(1).forEach(System.out :: println);

//        stream.filter(new Predicate<Employee>() {
//            @Override
//            public boolean test(Employee employee) {
//                return employee.getAge() > 18;
//            }
//        }).forEach(System.out::println);
    }
    
    @Test
    public void test2 () {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd", "ee", "ff");
        list.stream().map(String::toUpperCase).forEach(System.out::print);
        System.out.println();
        list.stream().sorted(String::compareTo).forEach(System.out::print);
    }
    
    @Test
    public void test3 () {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Tom", 18, new MyDate(2002, 2, 29)));
        employees.add(new Employee("Jim", 19, new MyDate(2001, 3, 29)));
        employees.add(new Employee("Acm", 18, new MyDate(2002, 1, 12)));
        employees.add(new Employee("Mon", 14, new MyDate(2006, 2, 29)));
        employees.add(new Employee("Jim", 20, new MyDate(2001, 3, 29)));
        employees.add(new Employee("Tom", 18, new MyDate(2002, 2, 29)));
        employees.add(new Employee("Jim1", 21, new MyDate(2001, 3, 29)));
        employees.add(new Employee("Acm2", 34, new MyDate(2002, 1, 12)));
        employees.add(new Employee("Mon3", 25, new MyDate(2006, 2, 29)));
        employees.add(new Employee("Jim4", 30, new MyDate(2001, 3, 29)));

//        System.out.println(employees.stream().min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())));
        System.out.println(employees.stream().min(Comparator.comparingInt(Employee::getAge)));

        Stream<Integer> ageStream = employees.stream().map(employee -> employee.getAge());
        System.out.println(ageStream.max(Integer::compareTo));
    }
    
    @Test
    public void test4 () {
        
    }
    
    @Test
    public void test5 () {
        
    }
}
