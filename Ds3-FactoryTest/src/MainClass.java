import java.util.Scanner;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/17
 */
public class MainClass {
    public static void main(String[] args) {
        //1.接受控制台输入
        System.out.println("------计算器程序------");
        System.out.println("输入第一个操作数：");
        Scanner scanner = new Scanner(System.in);
        String strNum1 = scanner.nextLine();

        System.out.println("输入操作符：");
        String oper = scanner.nextLine();

        System.out.println("输入第二个操作数：");
        String strNum2 = scanner.nextLine();

        double result = 0 ;
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        //2.进行运算
//        if("+".equals(oper)){
//            Operation operation = new AddOperation();
//            operation.setNun1(num1);
//            operation.setNum2(num2);
//            operation.getResult();
//        }else if("-".equals(oper)){
//            result = Double.parseDouble(strNum1) - Double.parseDouble(strNum2);
//        }else if("*".equals(oper)){
//            result = Double.parseDouble(strNum1) - Double.parseDouble(strNum2);
//        }else if("/".equals(oper)){
//            result = Double.parseDouble(strNum1) / Double.parseDouble(strNum2);
//        }


        //简单工厂 不需要改 mianClass 只需要维护工厂类 添加相应的操作类  符合开发 不封闭
//        Operation operation = OperationFactory.getOperation(oper);
//        operation.setNun1(num1);
//        operation.setNum2(num2);
//        result = operation.getResult();

        //工厂方法 不需要改工厂 只需要添加运算类，添加相应的工厂  但是需要改mainClass
        if("+".equals(oper)){
            OperationFactory2 factory2 = new AddOperationFactory();
            Operation operation = factory2.getOperation();
            operation.setNun1(num1);
            operation.setNum2(num2);
            result = operation.getResult();
        }

        //3.返回结果
        System.out.println(strNum1 + oper + strNum2 + "=" + result);
    }
}
