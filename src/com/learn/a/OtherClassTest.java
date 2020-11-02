package com.learn.a;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author admin
 * @create 2020/10/16
 */
public class OtherClassTest {

    @Test
    public void test1(){
        String javaVersion = System.getProperty("java.version");
        System.out.println("java的version:" + javaVersion);
        String javaHome = System.getProperty("java.home");
        System.out.println("java的home:" + javaHome);
        String osName = System.getProperty("os.name");
        System.out.println("os的name:" + osName);
        String osVersion = System.getProperty("os.version");
        System.out.println("os的version:" + osVersion);
        String userName = System.getProperty("user.name");
        System.out.println("user的name:" + userName);
        String userHome = System.getProperty("user.home");
        System.out.println("user的home:" + userHome);
        String userDir = System.getProperty("user.dir");
        System.out.println("user的dir:" + userDir);
    }

    @Test
    public void test2() {
        double random = Math.random();
        System.out.println("random = " + random);
    }

    /**
     * abs 绝对值
     * acos,asin,atan,cos,sin,tan 三角函数
     * sqrt 平方根
     * pow(double a,doble b) a的b次幂
     * log 自然对数
     * exp e为底指数
     * max(double a,double b)
     * min(double a,double b)
     * random() 返回0.0到1.0的随机数
     * long round(double a) double型数据a转换为long型（四舍五入）
     * toDegrees(double angrad) 弧度—>角度
     * toRadians(double angdeg) 角度—>弧度
     */
    @Test
    public void test3() {
        BigInteger bigInteger = new BigInteger("324352345345435234543534534534523453");
        System.out.println("bigInteger = " + bigInteger);
        
        BigDecimal bigDecimal = new BigDecimal("123123.123");
        BigDecimal bigDecimal4 = new BigDecimal("123123.123");
        BigDecimal bigDecimal1 = new BigDecimal("123123232131231231.123");
        BigDecimal bigDecimal2 = new BigDecimal("1232343223.1231");

        BigDecimal divide = bigDecimal.divide(bigDecimal4);
        System.out.println("divide = " + divide);

        BigDecimal divide1 = bigDecimal.divide(bigDecimal1,25, BigDecimal.ROUND_HALF_UP);
        System.out.println("divide1 = " + divide1);
    }
}
