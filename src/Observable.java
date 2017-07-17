/**
 * Created by osads on 14.07.2017.
 */
public interface Observable {
    void addObserver(Observer observer);
    void notifyObserver();
}
