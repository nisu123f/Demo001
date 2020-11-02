package com.learn.a;

/**
 * @author admin
 * @create 2020/10/16
 */
public class CompareGoods implements Comparable<CompareGoods>{
    private String name;
    private Double price;

    public CompareGoods() {
    }

    public CompareGoods(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CompareGoods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(CompareGoods good) {
        int compare = Double.compare(this.price, good.price);
        if (compare != 0) {
            return compare;
        }
        else {
            //价格相同时,按名字顺序排列   不加判断默认逆序
            return -this.name.compareTo(good.name);
        }
    }
}
