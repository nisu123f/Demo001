package com.learn.i;

/**
 * @author admin
 * @create 2020/10/23
 */
public class SubPage<T> extends Page<T>{

    public SubPage(T pageType, Integer pageSize) {
        super(pageType, pageSize);
    }
}
