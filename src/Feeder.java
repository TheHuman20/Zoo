public class Feeder implements Observer {

        @Override
        public void handle(Animal animal) {
            if(animal.isHungry()) {
                animal.full();
                System.out.println("You are fed, run!");
            }
        }
    }

