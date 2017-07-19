package Animals;

public class Lion extends Wild implements Observable {
    Lion(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color,isPredator);
    }

    public Lion() {

    }

    @Override
    public void sick() {
        super.sick();
        System.out.println(new java.util.Date() + " " + getId() + "'Animals.Dog look sick'");
        this.notifyObserver();
    }

    public void hungry() {
        super.hungry();
        System.out.println(new java.util.Date() + " " + getId() + " Woof! 'Animals.Wolf looks hungry'");
        this.notifyObserver();
    }
}
