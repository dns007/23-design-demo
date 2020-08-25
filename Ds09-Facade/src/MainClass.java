/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/23
 */
//外观模式
//使用场景：系统中有多个复杂的模块或者子系统的时候。
public class MainClass {
    public static void main(String[] args) {
        SystemA systemA = new SystemA();
        systemA.doSomething();

        SystemB systemB = new SystemB();
        systemB.doSomething();

        SystemC systemC = new SystemC();
        systemC.doSomething();
    }
}
