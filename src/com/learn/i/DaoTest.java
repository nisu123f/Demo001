package com.learn.i;

/**
 * @author admin
 * @create 2020/10/24
 */
public class DaoTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();

        dao.save("1001",  new User(1001, 18, "LiHua"));
        dao.save("1002",  new User(1002, 16, "Tom"));
        dao.save("1003",  new User(1003, 17, "Jim"));
        dao.save("1004",  new User(1004, 20, "Hua"));

        dao.list().forEach(System.out::println);
        System.out.println();
        dao.delete("1002");
        dao.list().forEach(System.out::println);

        dao.update("1001", new User(1001, 19, "Li"));

        System.out.println();
        dao.list().forEach(System.out::println);
    }
}
