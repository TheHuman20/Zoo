/**
 * Created by osads on 20.06.2017.
 */
public class Wild extends Animal {
    private boolean isPredator;

    public Wild(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public Wild() {

    }

    public String phrase() {
        String result = super.phrase();
        result += "I am a wild animal";
        if (isPredator = true){
            result += " and I am angry.";
            return result;
        }
        else {
            return result;
        }
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }
}
