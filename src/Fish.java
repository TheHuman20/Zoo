/**
 * Created by osads on 20.06.2017.
 */
public class Fish extends Domestic {
    public Fish(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public Fish() {
    }

    @Override
    public String phrase() {
        return "...";
    }
}
