package com.dns007.ex2;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/4/02
 */
public class CarTailHandler extends CarHandler {
    @Override
    public void handlerCar() {
        System.out.println("组装车尾");
        if(this.carHandler != null){
            this.carHandler.handlerCar();
        }
    }
}
