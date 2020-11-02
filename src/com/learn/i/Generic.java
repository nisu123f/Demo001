package com.learn.i;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author admin
 * @create 2020/10/23
 */
public class Generic {

    @Test
    public void test1() {
        Map<String, Integer> map = new HashMap<>(12);
        map.put("AA", 12);
        map.put("CC", 32);
        map.put("BB", 232);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("entries = " + entries);
        
    }
}
