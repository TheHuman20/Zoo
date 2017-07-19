package Animals;

public class Hamster extends Domestic {
    Hamster(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public Hamster() {
    }

    public void sick() {
        super.sick();
        System.out.println(new java.util.Date() + " " + getId() + " Animals.Hamster looks sick");
        this.notifyObserver();
    }

    public void hungry() {
        super.hungry();
        System.out.println(new java.util.Date() + " " + getId() + " Animals.Hamster looks hungry");
        this.notifyObserver();
    }

    public void unsheared() {
        super.unsheared();
        System.out.println(new java.util.Date() + " " + getId() + " Animals.Hamster looks hairy");
        this.notifyObserver();
    }
}