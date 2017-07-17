/**
 * Created by osads on 20.06.2017.
 */
public class GuideDog extends Domestic {
    private boolean isTrained;



    public GuideDog(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public GuideDog() {
    }

    @Override
    public String phrase() {
        String result = super.phrase();
        result += " I can take you home.";
        return result;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
}
