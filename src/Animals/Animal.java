package Animals;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by osads on 20.06.2017.
 */
public class Animal implements Observable{

    private int id;
    private int age;
    private double weight;
    private String color;
    private boolean isSick;
    private boolean isHungry;

    private List<Observer> observers = new ArrayList<>();

    public Animal(int id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;

    }

    public Animal() {

    }

    public String phrase() {
        return "Hello ";
    }

    public void greet() {
        System.out.println(phrase());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSick() {
        return isSick;
    }

    public void sick() {
        isSick = true;
    }

    public void healed(){
        isSick = false;
    }

    public boolean isHungry() {
        return isHungry;
    }


    public void hungry() {
        isHungry = true;
    }


    public void full() {
        isHungry = false;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }



    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.handle(this);
        }
    }

}

