package com.dns007.ex3;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/28
 */
public class Jeep extends Car {

    public Jeep(Engine engine){
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.println("Jeep");
        this.getEngine().installEngine();
    }
}
