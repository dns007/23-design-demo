/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/16
 */
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
