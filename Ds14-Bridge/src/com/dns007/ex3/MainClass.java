package com.dns007.ex3;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/28
 */
//桥接模式
public class MainClass {
    public static void main(String[] args) {
        Engine engine2000 = new Engine2000();
        Engine engine2200 = new Engine2200();

        Car car1 = new Bus(engine2000);
        car1.installEngine();

        Car car2 = new Bus(engine2200);
        car2.installEngine();

        Car jeep1= new Jeep(engine2000);
        jeep1.installEngine();

        Car jeep2 = new Jeep(engine2200);
        jeep2.installEngine();
    }

}

//（1）分离抽象和实现部分：把车、引擎抽象出来。实现与之分离。
//
//  2）松耦合：两个维度分开
//
// （3）单一职责原则：每个维度各干各的活
