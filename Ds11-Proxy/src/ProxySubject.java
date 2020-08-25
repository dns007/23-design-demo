/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/25
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject;

//    public void setRealSubject(RealSubject realSubject) {
//        this.realSubject = realSubject;
//    }

    @Override
    public void sellbook() {
        dazhe();
        if(realSubject ==null){
            realSubject = new RealSubject();
        }
        realSubject.sellbook();
        give();
    }

    public void dazhe(){
        System.out.println("打折");
    }

    public void give(){
        System.out.println("赠送代金券");
    }
}
