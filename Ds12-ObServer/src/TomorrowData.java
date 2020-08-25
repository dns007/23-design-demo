/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/26
 */
public class TomorrowData implements Observer {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }

    public void display(){
        System.out.println("+++++++++Tomorrow mTemperatrue:" + (mTemperatrue + Math.random())+"+++++++++");
        System.out.println("+++++++++Tomorrow mPressure:" + (mPressure + Math.random())+"++++++");
        System.out.println("+++++++++Tomorrow mHumidity:" + (mHumidity + Math.random())+"++++++");
    }
}
