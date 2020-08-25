package com.dns007;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/24
 */
public class Teacher extends Person {
    private String number;

    public Teacher(String name, int age, String sex, String number) {
        super(name, age, sex);
        this.number = number;
    }

    public Teacher(){
        super();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
