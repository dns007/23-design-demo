import java.util.ArrayList;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/26
 */
public class WeatherData implements Subject{
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;
    private ArrayList<Observer> mObservers;

    public WeatherData(){
        mObservers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(mObservers.contains(o)) {
            mObservers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0,len=mObservers.size();i<len; i++){
            mObservers.get(i).update(getmTemperatrue(), getmPressure(), getmHumidity());
        }
    }

    public void setData(float mTemperatrue, float mPressure, float mHumidity ){
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    public float getmTemperatrue() {
        return mTemperatrue;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void dataChange(){
        notifyObservers();
    }

}
