import java.util.ArrayList;
import java.util.List;

/**
 * Created by osads on 20.06.2017.
 */
public class Domestic extends Animal{
    private String name;
    private boolean isVaccinated;
    private boolean isSheared;


    public Domestic(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public Domestic(){
    }




    @Override
    public String phrase() {
        String result = super.phrase();
        if(name != null){
            result += "my name is " + getName();
        }
        return result;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public boolean isSheared() {
        return isSheared;
    }

    public void setSheared(boolean sheared) {
        isSheared = sheared;
    }

    public void sheared(){
        isSheared = true;
    }

    public void unsheared() {
        isSheared = false;
    }




    }

