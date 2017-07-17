import java.util.ArrayList;
import java.util.List;

/**
 * Created by osads on 20.06.2017.
 */
public class Lion extends Wild implements Observable {
    public Lion(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color,isPredator);
    }

    public Lion() {

    }

    @Override
    public void sick() {
        super.sick();
        System.out.println("Roar! Ro-khe-khe...");

    }
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer obsever : observers) {
            obsever.handle(this);
        }
    }
}
