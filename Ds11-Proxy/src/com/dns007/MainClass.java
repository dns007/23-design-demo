package com.dns007;

import java.lang.reflect.Proxy;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/25
 */
public class MainClass {
    public static void main(String[] args) {

        RealSubject realSubject = new RealSubject();
        MyHandler myHandler = new MyHandler();
        //可以通过set方法传入 也可以通过构造函数传参的方式传入真实对象
        myHandler.setRealSubject(realSubject);
                                                                //realSubject.getClass().getClassLoader();
        Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), realSubject.getClass().getInterfaces(), myHandler);
        proxySubject.sellbook();
    }
}

//动态代理 跟代理模式的差异在于 不需要自己创建代理角色 交给jdk 去处理， 只需要实现代理的调用方法类（包含真实对象角色的引用）
