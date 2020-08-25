/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/21
 */
public class RunCar implements Car {
    @Override
    public void show() {
        this.run();
    }

    @Override
    public void run() {
        System.out.println("可以跑");
    }

}
