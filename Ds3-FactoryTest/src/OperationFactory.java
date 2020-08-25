/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/17
 */
public class OperationFactory {
    public static Operation getOperation(String oper) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if("+".equals(oper)){
            return  new AddOperation();
        }else if("-".equals(oper)){
            return  new SubtractionOperation();
        }
        return null;

        //利用反射可以实现不修改
//        Class opclass = Class.forName(oper);
//        Operation operation1 = (Operation)opclass.newInstance();
//        return operation1;
    }
}
