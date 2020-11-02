package com.learn.n;

import com.learn.e.Employee;
import com.learn.e.MyDate;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @author admin
 * @create 2020/10/30
 */
public class LambdaEx {
    @Test
    public void test1 () {
        ArrayList<Employee> employee = new ArrayList<>();

        employee.add(new Employee("Tom", 18, new MyDate(2002, 2, 29)));
        employee.add(new Employee("Jim", 19, new MyDate(2001, 3, 29)));
        employee.add(new Employee("Acm", 18, new MyDate(2002, 1, 12)));
        employee.add(new Employee("Mon", 14, new MyDate(2006, 2, 29)));
        employee.add(new Employee("Jim", 20, new MyDate(2001, 3, 29)));

        Collections.sort(employee, (e1, e2) -> {
            int ageComp = Integer.compare(e1.getAge(), e2.getAge());
            if (ageComp == 0) {
                return e1.getName().compareTo(e2.getName());
            }
            return ageComp;
        });

//        Collections.sort(employee, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                int ageComp = o1.getAge().compareTo(o2.getAge());
//                if (ageComp == 0) {
//                    return o1.getName().compareTo(o2.getName());
//                }
//                return ageComp;
//            }
//        });

        for (int i = 0; i < employee.size(); i++) {
            System.out.println("employee" + i + " = " + employee.get(i));
        }

    }
}
