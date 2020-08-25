/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/20
 */
//平房工程队
public class PingFangBuilder implements HouseBuilder{
    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("平房——》地板");
    }

    @Override
    public void makeWall() {
        house.setWall("平房——》墙");
    }

    @Override
    public void makeHouseTop() {
        house.setHousetop("平房——》屋顶");
    }

    @Override
    public House getHouse() {
        return house;
    }


}
