/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/26
 */
public class CurrentData implements Observer {
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
        System.out.println("+++++++++Today mTemperatrue:" + mTemperatrue);
        System.out.println("+++++++++Today mPressure:" + mPressure);
        System.out.println("+++++++++Today mHumidity:" + mHumidity);
    }
}
