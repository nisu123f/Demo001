package com.learn.i;

import java.util.*;

/**
 * @author admin
 * @create 2020/10/24
 */
public class DAO<T> {
    private Map<String, T> map = new HashMap();

    //： 保存 T 类型的对象到 Map 成员 变量中
    public void save(String id,T entity) {
        map.put(id, entity);
    }
    //：从 map 中获取 id 对应的对象
    public T get(String id) {
        return map.get(id);
    }
    //：替换 map 中 key 为 id 的内容, 改为 entity 对象
    public void update(String id,T entity) {
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    //：返回 map 中存放的所有 T 对象
    public List<T> list() {
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t : values) {
            list.add(t);
        }
        return list;
    }
    //：删除指定 id 对象
    public void delete(String id) {
        map.remove(id);
    }
}
