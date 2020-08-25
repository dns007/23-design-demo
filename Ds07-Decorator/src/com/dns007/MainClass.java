package com.dns007;
//装饰器   抽象组件角色(car)  具体组件角色(Runcar)  抽象装饰角色(CarDecorator)  具体装饰角色(FlyCarDecorator)
//使用场景：装饰器模式可以动态地给一个对象添加一些额外的职责。
public class MainClass {
    public static void main(String[] args) {
        Car car = new RunCar();
        car.show();
        System.out.println("-------------------分割线----------------------");
        CarDecorator flyCar = new FlyCarDecorator(car);
        flyCar.show();
        System.out.println("-------------------分割线----------------------");
        CarDecorator swimflycar = new SwimDecorator(flyCar);
        swimflycar.show();

    }
}
