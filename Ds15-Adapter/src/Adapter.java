
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/29
 */
public class Adapter extends Current {
    public void user18V(){
        System.out.println("使用适配器");
        this.user220V();
    }
}
