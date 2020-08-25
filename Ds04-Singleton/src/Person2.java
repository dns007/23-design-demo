/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/18
 */
//饿汉式  多线程没发保证单例
public class Person2 {
    private String name;
    private static Person2 person;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //构造函数私有化
    private Person2(){

    }

    //提供一个全局的静态方法
    public static Person2 getPerson(){
        if(person == null ){
            person = new Person2();
        }
        return person;
    }
}
