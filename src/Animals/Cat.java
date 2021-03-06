package Animals;

public class Cat extends Domestic implements Observable {
    Cat(int id, int age, double weight, String color, String name, boolean isVaccinated) {
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

    public void unsheared() {
        super.unsheared();
        System.out.println(new java.util.Date() + " " + getId() + " Meow!'Looks hairy'");
        this.notifyObserver();
    }

}
