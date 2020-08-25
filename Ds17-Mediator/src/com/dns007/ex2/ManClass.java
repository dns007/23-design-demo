package com.dns007.ex2;

/**
 * @author dns007
 * @version 1.0
 * @date 2020/4/01
 */
public class ManClass {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Person zhangsan = new Man("张三", 7, mediator);
        Person lisi = new Man("李四", 7, mediator);

        Person xiaofang = new Woman("小芳",7, mediator);

//        zhangsan.getPartner(xiaofang);
        zhangsan.getPartner(lisi);

        xiaofang.getPartner(lisi);

    }
}

/*
中介模式  行为模式之一

1.将系统按功能分割成更小对象，符合类的最小设计原则
2.对关联对象的集中控制
3.减小类的耦合度
4.有利于提高类的重用性

Person 和 Mediaor 互相包含对方的引用   Person包含Mediator的引用是为了注册自己 Mediator包含Person引用是为了将Man和woman进行比较

 */
