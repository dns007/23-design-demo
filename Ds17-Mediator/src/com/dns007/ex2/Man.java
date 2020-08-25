package com.dns007.ex2;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/4/01
 */
public class Man extends Person {


    public Man(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    @Override
    public void getPartner(Person person) {
        this.getMediator().setMan(this);
        this.getMediator().getPartner(person);
    }
}
