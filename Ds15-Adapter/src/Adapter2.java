/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/29
 */
public class Adapter2 {
    private Current current;

    public Adapter2(Current current){
        this.current = current;
    }

    public void user18V(){
        System.out.println("使用适配器");
        this.current.user220V();
    }
}
