/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/26
 */
//观察者模式
public class InternetWeather {
    public static void main(String[] args) {
        CurrentData currentData = new CurrentData();
        TomorrowData tomorrowData = new TomorrowData();
        WeatherData weatherData = new WeatherData();

        weatherData.registerObserver(currentData);
        weatherData.registerObserver(tomorrowData);

        weatherData.setData(30, 150, 40);
        weatherData.removeObserver(currentData);
        weatherData.setData(40,250, 50);


        // 观察者模式  必须有一个主题   多个观察者
        //主题发布信息 ，多个观察者即可更新信息
        //主题必须包含观察者对象列表 以及相关操作（加入、移除、通知）——》 实现接口（注册、移除、通知）
        //观察者 ——》实现更接口（更新）

    }
}
