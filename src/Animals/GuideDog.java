package Animals;

public class GuideDog extends Domestic {
    private boolean isTrained;



    GuideDog(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
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

    public void sick() {
        super.sick();
        System.out.println(new java.util.Date() + " " + getId() + "'Guide Animals.Dog look sick'");
        this.notifyObserver();
    }

    public void hungry() {
        super.hungry();
        System.out.println(new java.util.Date() + " " + getId() + " 'Guide Animals.Dog looks hungry'");
        this.notifyObserver();
    }

    public void unsheared() {
        super.unsheared();
        System.out.println(new java.util.Date() + " " + getId() + " 'Guide Animals.Dog looks hairy'");
        this.notifyObserver();
    }
}
