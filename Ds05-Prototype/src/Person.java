import com.sun.org.apache.bcel.internal.generic.LSTORE;

import java.util.ArrayList;
import java.util.List;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/19
 */
public class Person implements Cloneable{
    private String name;
    private int age;
    private String sex;
    private List<String> friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public Person clone(){
        try {
//            return (Person)super.clone();

            Person person = (Person)super.clone();
            //引用类型不能通过clone来克隆，必须深度克隆
            List<String> newFriends = new ArrayList<String>();
            for (String friend: this.getFriends()
                 ) {
                newFriends.add(friend);
            }
            person.setFriends(newFriends);
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
