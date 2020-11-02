package com.learn.d;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author admin
 * @create 2020/10/18
 */
public class HashSetSupperSupperSupperSupperImportantTest {
    @Test
    public void hashTest() {

        HashSet hashSet = new HashSet();

        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");

        hashSet.add(p1);
        hashSet.add(p2);
        System.out.println(hashSet);
        //[Person{id=1002, name='BB'}, Person{id=1001, name='AA'}]


        p1.setName("CC");
        System.out.println(hashSet);
        //[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}]


        hashSet.remove(p1);
        System.out.println(hashSet);
        //[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}]

        hashSet.add(new Person(1001, "CC"));
        System.out.println(hashSet);
        //[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}, Person{id=1001, name='CC'}]

        hashSet.add(new Person(1001, "AA"));
        System.out.println(hashSet);
        //[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}, Person{id=1001, name='CC'}, Person{id=1001, name='AA'}]





    }
}


class Person {

    private Integer id;
    private String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (id != null ? !id.equals(person.id) : person.id != null) {
            return false;
        }
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
