package HW_fruits;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;


    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }


    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }




}