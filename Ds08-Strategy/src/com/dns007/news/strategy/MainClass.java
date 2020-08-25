package com.dns007.news.strategy;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/22
 */
//策略模式  提供了管理相关算法族的方法   将调用和 策略算法解耦  调用包含算法的引用
//缺点：客户端必须知道所有的算法或者行为
public class MainClass {
    public static void main(String[] args) {
        double num = 200;
        Context context = new Context(new StrategyB());
        double newnum = context.cost(num);
        System.out.println("实际付账："+ newnum +"元");
    }
}
