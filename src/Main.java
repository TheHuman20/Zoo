import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<Animal>();

        Cat cat = new Cat(1, 3, 3.4, "Grey", "Murka", true);
        zoo.add(cat);
        Dog dog = new Dog(3, 7, 16, "Black", "Tuzik", true);
        zoo.add(dog);
        Dog dog2 = new Dog(3, 7, 16, "Black", "Tuzik", true);
        zoo.add(dog2);
//        Lion lion = new Lion(2,10,90,"Yellow",true);
//        zoo.add(lion);
//        Fish fish = new Fish(4,3,0.2,"Gold","Karas'",false);
//        zoo.add(fish);
//        GuideDog cleverDog = new GuideDog(5,10,10,"White","Sharik",true,true);
//        zoo.add(cleverDog);
//        Hamster hamster = new Hamster(6,1,0.1,"Red", false);
//        zoo.add(hamster);
//        Giraffe giraffe = new Giraffe(7,33,36,"Spot",false);
//        zoo.add(giraffe);
        Crocodile crocodile = new Crocodile(8, 10, 100, "Green", true);
        zoo.add(crocodile);

        Doctor doctor = new Doctor("James");
        Feeder feeder = new Feeder("Angus");
        HairDresser hairDresser = new HairDresser("David");
        Feeder feeder2 = new Feeder("Robert");
        Director director = new Director();


        ListIterator<Animal> zooIter = zoo.listIterator();

        while(zooIter.hasNext()){
            Animal animal = zooIter.next();
            animal.addObserver(doctor);
            animal.addObserver(feeder);
            animal.addObserver(director);
            if (animal instanceof Domestic) {
                animal.addObserver(hairDresser);
            }
        }

        cat.sick();
        crocodile.sick();

        if(zoo.size()>3)
            {
                while(zooIter.hasNext()){
                Animal animal = zooIter.next();
                animal.getObservers().clear();
                animal.addObserver(doctor);
                animal.addObserver(director);

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
