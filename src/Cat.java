import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cat extends Domestic implements Observable {
    public Cat(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public Cat() {
    }

    @Override
    public String phrase() {
        String result = super.phrase();
        result += "Meow! ";
        return result;
    }

    @Override
    public void sick() {
        super.sick();
        System.out.println(new java.util.Date() + " " + getId() + " Meow, khe-khe, meow!");
        this.notifyObserver();
    }

    public void hungry() {
        super.hungry();
        System.out.println(new java.util.Date() + " " + getId() + " Meow!'Looks hungry'");
        this.notifyObserver();
    }

    public void unshorn() {
        super.unsheared();
        System.out.println(new java.util.Date() + " " + getId() + " Meow!'Looks hairy'");
        this.notifyObserver();
    }

}
