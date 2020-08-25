package com.dns007.ex1;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/4/01
 */
/*
中介模式
 */
public class MainClass {
    public static void main(String[] args) {
        Person zhangsan = new Man("张三",5);
        Person xiaofang = new Woman("小芳", 6);
        Person lisi = new Man("李四", 6);

        zhangsan.getPartner(xiaofang);
        lisi.getPartner(xiaofang);
        zhangsan.getPartner(lisi);
    }
}
