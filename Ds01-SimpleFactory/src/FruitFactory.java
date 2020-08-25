/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/15
 */
public class FruitFactory {
//    public static Fruit getApple(){
//        return new Apple();
//    }
//
//    public static Fruit getBanana(){
//        return new Banana();
//    }

    /** get方法获取说有产品对象**/
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        if(type.equals("apple")){
//            return Apple.class.newInstance();
//        }else if(type.equals("banana")){
//            return Banana.class.newInstance();
//        }else {
//            System.out.println("找不到产品对象");
//            return null;
//        }

        //根据类名获取字节码对象
        Class fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();
    }

}
