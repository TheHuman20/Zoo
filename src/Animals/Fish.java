package Animals;

public class Fish extends Wild {
    Fish(int id, int age, double weight, String color, String name, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public Fish() {
    }

    @Override
    public String phrase() {
        return "...";
    }

    public void sick() {
        super.sick();
        System.out.println(new java.util.Date() + " " + getId() + " Animals.Fish surfaced belly");
        this.notifyObserver();
    }

    public void hungry() {
        super.hungry();
        System.out.println(new java.util.Date() + " " + getId() + " Animals.Fish looks hungry");
        this.notifyObserver();
    }
}
