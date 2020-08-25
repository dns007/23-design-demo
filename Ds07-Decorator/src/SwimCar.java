/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/21
 */
public class SwimCar implements Car{
    @Override
    public void show() {
        this.run();
        this.swim();
    }

    @Override
    public void run() {
        System.out.println("可以跑");
    }

    public void swim(){
        System.out.println("可以游");
    }
}
