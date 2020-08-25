/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/22
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void encrypt(){
        this.strategy.encrypt();
    }
}
