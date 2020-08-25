/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/18
 */
public class MainClass {
    public static void main(String[] args) {
        Person2 per = Person2.getPerson();
        Person2 per2 = Person2.getPerson();
//        Person per = new Person();
//        Person per2 = new Person();
        per.setName("zhangsan");
        per2.setName("lisi");
        System.out.println(per.getName());
        System.out.println(per2.getName());
    }
}
