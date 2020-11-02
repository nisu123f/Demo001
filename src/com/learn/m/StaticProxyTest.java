package com.learn.m;

/**
 * @author admin
 * @create 2020/10/26
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        ClothFactory nike = new NikeClothFactory();

        ClothFactory proxyClothFactory = new ProxyClothFactory(nike);

        proxyClothFactory.produceCloth();
    }

}


interface ClothFactory {
    void produceCloth();
}


//代理类
class ProxyClothFactory implements ClothFactory {

    private ClothFactory clothFactory;

    public ProxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂的准备阶段");
        //调用工厂
        clothFactory.produceCloth();

        System.out.println("代理工厂的收尾工作");
    }
}

//被代理类
class NikeClothFactory implements ClothFactory {

    @Override
    public void produceCloth() {
        System.out.println("我们nike工厂在生产一批运动服");
    }
}




