/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/17
 */
public class SubtractionOperation extends Operation {
    @Override
    public double getResult() {
        double result = this.getNun1() - this.getNum2();
        return result;
    }
}
