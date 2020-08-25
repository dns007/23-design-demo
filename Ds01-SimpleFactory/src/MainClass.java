/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/15
 */
//简单工厂模式
public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//        Fruit apple = new Apple();
//        Fruit banbana = new Banana();
//        apple.get();
//        banbana.get();

//        1.写死
//        Fruit apple = FruitFactory.getApple();
//        Fruit banana = FruitFactory.getBanana();
//        apple.get();
//        banana.get();

//        2.（推荐）优点比较灵活，确定添加产品需要修改工厂类
//        Fruit apple = FruitFactory.getFruit("apple");
//        Fruit banbana = FruitFactory.getFruit("banbana");
//        apple.get();
//        banbana.get();

        //3.优点扩展性好；缺点 必须要知道具体类名，比较死
        Fruit apple = FruitFactory.getFruit("Apple");
        Fruit banbana = FruitFactory.getFruit("Banbana");
        apple.get();
        banbana.get();

        /**  例子：数据库连接池
         *
         */
    }
}
