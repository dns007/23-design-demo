/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/16
 */
//工厂方法模式
public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        FruitFactory ff = new AppleFactory();
        Fruit apple = ff.getFruit();
        apple.get();

        FruitFactory bb = new BananaFactory();
        Fruit banana = bb.getFruit();
        banana.get();

        //符合开闭原则， 新增一个产品，只需要新增一个工厂类，不需要修改原工厂。
    }
}
