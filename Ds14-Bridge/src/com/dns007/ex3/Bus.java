package com.dns007.ex3;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/28
 */
public class Bus extends Car {

    public Bus(Engine engine){
        super(engine);
    }
    @Override
    public void installEngine() {
        System.out.println("Bus");
        this.getEngine().installEngine();
    }
}
