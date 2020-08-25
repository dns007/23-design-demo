import java.util.ArrayList;
import java.util.List;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/19
 */
//原型模式
public class MainClass {
    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.setName("张三");
//        person1.setAge(30);
//        person1.setSex("男");
//
////        Person person2 = new Person();
////        person2.setName("李四");
////        person2.setAge(30);
////        person2.setSex("男");
//
//        //Person person2 = person1;
//        Person person2 = person1.clone();

        Person person1 = new Person();
        List<String> friends = new ArrayList<>();
        friends.add("王五");
        friends.add("赵六");
        person1.setFriends(friends);

        Person person2 = person1.clone();
        System.out.println(person1.getFriends().toString());
        System.out.println(person2.getFriends().toString());

        friends.add("77");
//        person1.setFriends(friends);
        System.out.println(person1.getFriends().toString());
        System.out.println(person2.getFriends().toString());

    }
}
