/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/24
 */
//享元模式 构造型模式之一， 通过与其他类似对象共享数据来减小内存占用 节省空间
//抽象享元角色  具体享元角色  享元工厂角色
//核心思想： 一个map 存储对象
public class MainClass {

    public static void main(String[] args) {
//        MyCharacter myChar1 = new MyCharacter('a');
//        MyCharacter myChar2 = new MyCharacter('b');
//        MyCharacter myChar3 = new MyCharacter('a');
//        MyCharacter myChar4 = new MyCharacter('d');
//
//        myChar1.display();
//        myChar2.display();
//        myChar3.display();
//        myChar4.display();
//
//        if(myChar1 == myChar3){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }

        // 创建MyCharacter工厂
        MyCharacterFactory myCharacterFactory = new MyCharacterFactory();
        MyCharacter myCharacter1 = myCharacterFactory.getMyCharacter('a');
        MyCharacter myCharacter2 = myCharacterFactory.getMyCharacter('b');
        MyCharacter myCharacter3 = myCharacterFactory.getMyCharacter('a');
        MyCharacter myCharacter4 = myCharacterFactory.getMyCharacter('d');

        myCharacter1.display();
        myCharacter2.display();
        myCharacter3.display();
        myCharacter4.display();

        if(myCharacter1 == myCharacter3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
