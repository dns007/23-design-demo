/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/20
 */
public class GongyuBulider implements HouseBuilder {
    House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("公寓——》地板");
    }

    @Override
    public void makeWall() {
        house.setWall("公寓——》地板");
    }

    @Override
    public void makeHouseTop() {
        house.setHousetop("公寓——》地板");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
