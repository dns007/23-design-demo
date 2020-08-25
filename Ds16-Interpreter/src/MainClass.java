import java.util.ArrayList;
import java.util.List;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/30
 */
/*
解释器模式
 */
public class MainClass {
    public static void main(String[] args) {
        String number = "10";
        Context context = new Context(number);

//        Expression expression = new PlusExpression();
//        expression.interpret(context);
//        System.out.println(context.getOutput());
//
//        Expression expression2 = new MinusExpression();
//        expression2.interpret(context);
//        System.out.println(context.getOutput());

        List<Expression> list = new ArrayList<Expression>();
        list.add(new PlusExpression());
        list.add(new PlusExpression());
        list.add(new PlusExpression());
        list.add(new PlusExpression());
        list.add(new MinusExpression());
        list.add(new MinusExpression());
        list.add(new PlusExpression());

        for(Expression ex : list){
            ex.interpret(context);
            System.out.println(context.getOutput());
        }

    }
}
