package com.dns007.ex1;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/4/01
 */
public class Woman extends Person {
    public Woman(String name, int condition) {
        super(name, condition);
    }

    @Override
    public void getPartner(Person person) {
        if(person instanceof Woman){
            System.out.println("我不是同性恋");
        }else{
            if(this.getCondition() == person.getCondition()){
                System.out.println(this.getName()+"和" + person.getName()+"绝配");
            }else{
                System.out.println(this.getName()+"和" + person.getName()+"不相配");
            }
        }
    }
}
