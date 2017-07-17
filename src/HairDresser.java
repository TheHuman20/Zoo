/**
 * Created by osads on 15.07.2017.
 */
public class HairDresser implements Observer {
    private String name;

    public HairDresser(String name) {
        this.name = name;
    }

    @Override
    public void handle(Animal animal) {
        if(((Domestic)animal).isSheared()) {
            ((Domestic)animal).sheared();
            System.out.println("You are sheared, run!");
        }
    }
    public String getName() {
        return name;
    }
}

