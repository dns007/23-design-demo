package com.dns007.ex1;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/4/01
 */
public abstract class Person {
    private String name;
    private int condition;

    public Person(String name, int condition) {
        this.name = name;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public abstract void getPartner(Person person);
}
