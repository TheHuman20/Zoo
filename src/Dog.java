import java.util.ArrayList;
import java.util.List;

/**
 * Created by osads on 20.06.2017.
 */
public class Dog extends Domestic{
    public Dog(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public Dog() {
    }

    @Override
    public String phrase() {
        String result = super.phrase();
        result += " Woof! ";
        return result;
    }
    @Override
    public void sick() {
        super.sick();
        System.out.println(new java.util.Date() + " " + getId() + "'Dog look sick'");
        this.notifyObserver();
    }

    public void hungry() {
        super.hungry();
        System.out.println(new java.util.Date() + " " + getId() + " Woof! 'Looks hungry'");
        this.notifyObserver();
    }

    public void unsheared() {
        super.unsheared();
        System.out.println(new java.util.Date() + " " + getId() + " Woof! 'Looks hairy'");
        this.notifyObserver();
    }

}
