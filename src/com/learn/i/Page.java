package com.learn.i;

/**
 * @author admin
 * @create 2020/10/23
 */
public class Page<T> {
    private T pageType;
    private Integer pageSize;

    public Page(T pageType, Integer pageSize) {
        this.pageType = pageType;
        this.pageSize = pageSize;
    }

    public T getPageType() {
        return pageType;
    }

    public void setPageType(T pageType) {
        this.pageType = pageType;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
