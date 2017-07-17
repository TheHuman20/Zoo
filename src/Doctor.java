public class Doctor implements Observer {

    @Override
    public void handle(Animal animal) {
        if (animal.isSick()) {
            animal.healed();
            System.out.println("You are healed, run!");
        }
    }
}
