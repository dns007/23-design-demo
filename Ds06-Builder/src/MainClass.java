
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/20
 */
//建造者模式 ：易于解耦，将产品本身与产品创建过程进行解耦，可以使用相同的创建过程来得到不同的产品。也就说细节依赖抽象。
//应用场景：需要生成的产品对象有复杂的内部结构，这些产品对象具备共性；隔离复杂对象的创建和使用，并使得相同的创建过程可以创建不同的产品

public class MainClass {
    public static void main(String[] args) {
        //客户修房子
//        House house = new House();
//        house.setFloor("地板");
//        house.setWall("墙");
//        house.setHousetop("屋顶");


        //由工程队修房子   //此次屏蔽了房子的细节 将房子通过builder解耦出去，如果再用反射即可到达完全动态加载
        HouseBuilder builder = new GongyuBulider(); // new PingFangBuilder();
        //设计者来做  //将房子的创建过程和产品本身解耦
        HouseDirector director = new HouseDirector();
        House house =  director.makeHouse(builder);

        System.out.println(house.getFloor());
        System.out.println(house.getWall());
        System.out.println(house.getHousetop());
    }
}
