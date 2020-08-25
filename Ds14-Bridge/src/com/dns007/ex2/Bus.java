package com.dns007.ex2;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/28
 */
public class Bus implements Car {
    @Override
    public void installEngine2000() {
        System.out.println("bus安装2000发动机");
    }

    @Override
    public void installEngine2200() {
        System.out.println("bus安装2200发动机");
    }

    @Override
    public void installEngine2300() {
        System.out.println("bus安装2300发动机");
    }
}
