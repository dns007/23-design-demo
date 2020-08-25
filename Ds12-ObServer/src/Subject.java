/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/26
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
