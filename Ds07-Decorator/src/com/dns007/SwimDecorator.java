package com.dns007;

public class SwimDecorator extends CarDecorator {

    public SwimDecorator(Car car){
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }

    @Override
    public void run() {

    }

    public void swim(){
        System.out.println("可以游");
    }
}
