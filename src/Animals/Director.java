package Animals;

/**
 * Created by osads on 15.07.2017.
 */
public class Director implements Observer {
    @Override
    public void handle(Animal animal) {
        System.out.println("Big brother watching you...");
    }
}
