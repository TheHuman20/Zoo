package Animals;

/**
 * Created by osads on 20.06.2017.
 */
public class Crocodile extends Wild implements Observable {
    public Crocodile(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public Crocodile() {
    }
    @Override
    public void sick() {
        super.sick();
        System.out.println(new java.util.Date() + " " + getId() + " agr'");
        this.notifyObserver();

    }
    @Override
    public void hungry() {
        super.hungry();
        System.out.println(new java.util.Date() + " " + getId() + " agr'");
        this.notifyObserver();
    }

}
