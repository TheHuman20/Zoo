import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();

        Cat cat = new Cat(1, 3, 3.4, "Grey", "Gizmo", true);
        zoo.add(cat);
        Dog dog = new Dog(3, 7, 16, "Black", "Leonard", true);
        zoo.add(dog);
        Lion lion = new Lion(2,10,90,"Yellow",true);
        zoo.add(lion);
        Fish fish = new Fish(4,3,0.2,"Gold","Unnamed",false);
        zoo.add(fish);
        GuideDog cleverDog = new GuideDog(5,10,10,"White","Cooper",true,true);
        zoo.add(cleverDog);
        Hamster hamster = new Hamster(6,1,0.1,"Red", "Humsy", true);
        zoo.add(hamster);
        Giraffe giraffe = new Giraffe(7,33,36,"Spock",false);
        zoo.add(giraffe);
        Crocodile crocodile = new Crocodile(8, 10, 100, "Green", true);
        zoo.add(crocodile);

        Director director = new Director();
        Doctor doctor = new Doctor();
        Feeder feeder = new Feeder();
        HairDresser hairDresser = new HairDresser();
        Feeder feeder2 = new Feeder();


        ListIterator<Animal> zooIterator = zoo.listIterator();

        while(zooIterator.hasNext()){
            Animal animal = zooIterator.next();
            animal.addObserver(director);
            animal.addObserver(doctor);
            animal.addObserver(feeder);
            if (animal instanceof Domestic) {
                animal.addObserver(hairDresser);
            }
        }

        cat.sick();
        System.out.println("");
        crocodile.hungry();
        System.out.println("");
        cat.unsheared();
        System.out.println("");

        if(zoo.size()>7)  //magic number, only for test
            {
                while(zooIterator.hasNext()){
                Animal animal = zooIterator.next();
                animal.getObservers().clear();
                animal.addObserver(director);
                animal.addObserver(doctor);

                if (animal instanceof Domestic)
                {
                animal.addObserver(hairDresser);
                animal.addObserver(feeder);
                }

                if (animal instanceof Wild)
                animal.addObserver(feeder2);
        }
        System.out.println("Animals are regrouped for two feeders.");
    }

    }


//        for(Animal animal: zoo){
//            Animal an = (Domestic)animal;
//
//            };
    }
