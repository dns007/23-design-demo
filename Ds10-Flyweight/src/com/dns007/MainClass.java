package com.dns007;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/24
 */
//享元模式 构造型模式之一， 通过与其他类似对象共享数据来减小内存占用 节省空间
//抽象享元角色  具体享元角色  享元工厂角色
public class MainClass {

    public static void main(String[] args) {
        TeacherFactory factory = new TeacherFactory();
        Teacher teacher1 = factory.getTeacher("0102034");
        Teacher teacher2 = factory.getTeacher("0102035");
        Teacher teacher3 = factory.getTeacher("0102034");
        Teacher teacher4 = factory.getTeacher("0102037");

        System.out.println(teacher1.getNumber());
        System.out.println(teacher2.getNumber());
        System.out.println(teacher3.getNumber());
        System.out.println(teacher4.getNumber());

        if(teacher1 == teacher3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
