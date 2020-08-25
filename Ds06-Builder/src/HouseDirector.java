/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/20
 */
public class HouseDirector {

    public House makeHouse(HouseBuilder builder){
        builder.makeFloor();
        builder.makeWall();
        builder.makeHouseTop();
        return  builder.getHouse();
    }
}
