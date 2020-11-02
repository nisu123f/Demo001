package com.learn.m;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author admin
 * @create 2020/10/26
 */
public class ProxyTest {
    public static void main(String[] args) {

        SuperMan superMan = new SuperMan();
        //代理实例 - 代理superMan的.....
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);

        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("yu");
        System.out.println("_________________________________________");
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ClothFactory proxyInstance1 = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);
        proxyInstance1.produceCloth();
        System.out.println("_________________________________________");
        Dancer dancer = new Dancer();
        Star proxyInstance2 = (Star) ProxyFactory.getProxyInstance(dancer);
        proxyInstance2.show();
        System.out.println("_________________________________________");
        Singer singer = new Singer();
        Star proxyInstance3 = (Star) ProxyFactory.getProxyInstance(singer);
        proxyInstance3.show();


    }
}

interface Human {
    String getBelief();

    void eat(String food);
}

//被代理类

class SuperMan implements Human {
    @Override
    public String getBelief() {
        return "能力越大,责任越大";
    }

    @Override
    public void eat(String food) {
        System.out.println("我爱吃" + food);
    }
}

class HumanUtils {
    public void method1() {
        System.out.println("----------通用方法1-----------");
    }
    public void method2() {
        System.out.println("----------通用方法2-----------");
    }
}

class ProxyFactory {
    public static Object getProxyInstance(Object obj) {
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
    }
}

class MyInvocationHandler implements InvocationHandler {

    private Object obj;

    public void bind(Object obj) {
        this.obj = obj;
    }

    /*
    * proxy - 调用该方法的代理实例
    * method -所述方法对应于调用代理实例上的接口方法的实例。 方法对象的声明类将是该方法声明的接口，它可以是代理类继承该方法的代理接口的超级接口。
    * args -包含的方法调用传递代理实例的参数值的对象的阵列，或null如果接口方法没有参数。 原始类型的参数包含在适当的原始包装器类的实例中，例如java.lang.Integer或java.lang.Boolean 。
    * */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        HumanUtils util = new HumanUtils();
        util.method1();

        Object invoke = method.invoke(obj, args);

        util.method2();

        return invoke;

    }
}


