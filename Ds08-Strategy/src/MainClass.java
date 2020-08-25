import java.util.SplittableRandom;
//策略模式
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/22
 */
public class MainClass {
    public static void main(String[] args) {
//        Strategy strs = new MD5Strategy();
//        strs.encrypt();

        Context context = new Context(new MD5Strategy());
        context.encrypt();
    }
}
