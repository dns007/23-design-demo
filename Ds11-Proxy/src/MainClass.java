/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/25
 */
public class MainClass {
    public static void main(String[] args) {
//        RealSubject realSubject = new RealSubject();
//        realSubject.sellbook();

        ProxySubject proxySubject = new ProxySubject();
        proxySubject.sellbook();
    }

}

// 1.抽象主题角色 {Subject） 2.真实主题角色（RealSubject）  3.代理主题角色（ProxySubject）
//2.3 实现1 ； 3包含2的引用 对2的方法进行增强
// 代理和装饰模式的区别，从结果上看都可以实现对方法的增强，
// 但是关注的出发点不同，代理的重心是为了借用对象的功能完成某一流程，而非对象功能如何。
// 而装饰模式，注重对对象功能的扩展，它不关心外界如何调用，只注重对对象功能的加强，装饰后还是对象本身。
