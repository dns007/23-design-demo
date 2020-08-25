package com.dns007;

public class FlyCarDecorator extends CarDecorator{

    public FlyCarDecorator(Car car){
        super(car);
    }

    @Override
    public void show(){
        this.getCar().show();
        this.fly();
    }

    @Override
    public void run() {

    }

    public void fly(){
        System.out.println("可以飞");
    }
}
