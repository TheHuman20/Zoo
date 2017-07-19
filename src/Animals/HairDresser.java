package Animals;

public class HairDresser implements Observer {

    @Override
    public void handle(Animal animal) {
         if(!((Domestic)animal).isSheared()) {
            ((Domestic)animal).sheared();
             System.out.println("You are sheared, run!");
         }
    }
}

