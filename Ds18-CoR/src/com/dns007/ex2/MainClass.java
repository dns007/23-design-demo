package com.dns007.ex2;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/4/02
 */
/*
chain of responsibility
职责链模式  行为模式之一 ：构造一系列分担不同职责的类的对象来共同完成一个任务
场景：client 要完成一个任务  a完成a部分 交给b b完成b部分 交给c c完成c部分 交给d d完成d部分
场景2：软件窗口的消息传播
场景3：servlet 容器过滤器 filter框架的实现
 */
public class MainClass {
    public static void main(String[] args) {
        CarHandler head = new CarHeadHandler();
        CarHandler body = new CarBodyHandler();
        CarHandler tail = new CarTailHandler();

        //组装顺序设置好 车头——》车身——》车尾
        head.setNextHandler(body);
        body.setNextHandler(tail);

        //调用链头来完成操作
        head.handlerCar();

        //顺序改变，希望是车身——》车头——》车尾
        body.setNextHandler(head);
        head.setNextHandler(tail);
        body.handlerCar();

        //改进操作
        body.setNextHandler(head).setNextHandler(tail);
        body.handlerCar();
    }
}
