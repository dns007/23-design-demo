/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/29
 */
//适配器模式  构造型模式之一
//例子1.使用继承的方式
//例子2 使用聚合的方式，包含引用
//举例：姚明 和翻译  翻译就是适配器      英文——》翻译——》姚明
public class MainClass {
    public static void main(String[] args) {
//        Current current = new Current();
//        current.user220V();

//        Current current = new Adapter();
//        ((Adapter) current).user18V();

        Adapter2 adapter2 = new Adapter2(new Current());
        adapter2.user18V();
    }
}
