
public class Giraffe extends Wild {
    Giraffe(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public Giraffe() {
    }

    public void sick() {
        super.sick();
        System.out.println(new java.util.Date() + " " + getId() + "Giraffe looks sick");
        this.notifyObserver();
    }

    public void hungry() {
        super.hungry();
        System.out.println(new java.util.Date() + " " + getId() + " Giraffe looks hungry");
        this.notifyObserver();
    }


}
