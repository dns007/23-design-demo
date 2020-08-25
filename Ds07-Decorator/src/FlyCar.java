/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/21
 */
public class FlyCar implements Car {
    @Override
    public void show() {
        this.run();
        this.fly();
    }

    @Override
    public void run() {
        System.out.println("可以跑");
    }

    public void fly(){
        System.out.println("可以飞");
    }
}
