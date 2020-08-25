package com.dns007.ex3;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/28
 */
public abstract class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public abstract void installEngine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
