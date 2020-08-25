/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/17
 */
//抽象工厂模式
public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        FruitFactory ff = new NorthFruitFactory();
        Fruit apple = ff.getAplle();
        apple.get();
        Fruit banana = ff.getBanana();
        banana.get();

        FruitFactory ff2 = new SouthFruitFactory();
        Fruit apple2 = ff2.getAplle();
        apple2.get();
        Fruit banana2 = ff2.getBanana();
        banana2.get();
    }
    /**  ocp 原则  open-close-协议
     * 产品族的引入  方法对应产品结构
     *
     * 抽象工厂  具体工厂  抽象角色 具体产品角色
     */
}
