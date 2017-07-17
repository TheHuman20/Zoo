/**
 * Created by osads on 15.07.2017.
 */
public class Feeder implements Observer {
    private String name;

    public Feeder(String name) {
        this.name = name;
    }

        @Override
        public void handle(Animal animal) {
            if(animal.isHungry()) {
                animal.full();
                System.out.println("You are fed, run!");
            }
        }
        public String getName() {
            return name;
        }
    }

