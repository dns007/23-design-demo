/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/17
 */
public abstract class Operation {
    private double nun1;
    private double num2;

    public double getNun1() {
        return nun1;
    }

    public void setNun1(double nun1) {
        this.nun1 = nun1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public abstract double getResult();
}
