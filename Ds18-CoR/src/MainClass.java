/**
 * @author dns007
 * @version 1.0
 * @date 2020/4/02
 */
public class MainClass {
    public static void main(String[] args) {
        CarHandler head = new CarHeadHandler();
        CarHandler body = new CarBodyHandler();
        CarHandler tail = new CarTailHandler();

        head.handlerCar();
        body.handlerCar();
        tail.handlerCar();
    }
}
