/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/30
 */
public class MinusExpression extends Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("自动递减");
        String input = context.getInput();
        int intInput = Integer.parseInt(input);
        intInput--;
        context.setInput(String.valueOf(intInput));
        context.setOutput(intInput);
    }
}
