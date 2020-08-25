/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/17
 */
public class AddOperationFactory implements OperationFactory2 {
    @Override
    public Operation getOperation() {
        return new AddOperation();
    }
}
