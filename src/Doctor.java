public class Doctor implements Observer {


    private String name;

    public Doctor(String name) {
        this.name = name;
    }


    @Override
    public void handle(Animal animal) {
        if(animal.isSick()) {
            animal.healed();
            System.out.println("You are healed, run!");
        }
    }
    public String getName() {
        return name;
    }
}
