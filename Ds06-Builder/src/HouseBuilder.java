//工程队
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/20
 */
public interface HouseBuilder {
    //修地板
    public void makeFloor();
    //修墙
    public void makeWall();
    //修屋顶
    public void makeHouseTop();

    public House getHouse();
}
