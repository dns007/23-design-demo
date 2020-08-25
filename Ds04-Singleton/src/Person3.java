/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/18
 */
//饿汉式 加同步
public class Person3 {
    private String name;
    private static Person3 person;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //构造函数私有化
    private Person3(){

    }

    //提供一个全局的静态方法  加同步保证多线程
    public static synchronized Person3 getPerson(){
        if(person == null ){
            person = new Person3();
        }
        return person;
    }
}
