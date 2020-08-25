/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/18
 */
//懒汉式 类加载及初始化对象的时候 new单例 线程安全
public class Person {
    private String name;
    public static final Person person = new Person();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //构造函数私有化
    private Person(){

    }

    //提供一个全局的静态方法
    public static Person getPerson(){
        return person;
    }
}
