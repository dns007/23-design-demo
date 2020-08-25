/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/17
 */
public class NorthFruitFactory implements FruitFactory {
    @Override
    public Fruit getAplle() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
