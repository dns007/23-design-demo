package com.dns007.ex2;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/4/02
 */
public abstract class CarHandler {
    protected CarHandler carHandler;

    public CarHandler setNextHandler(CarHandler carHandler){
        this.carHandler = carHandler;
        return this.carHandler;
    }
    public abstract void handlerCar();
}
