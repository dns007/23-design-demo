/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/16
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
