package lessons;

import java.util.Arrays;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet <Integer> setA = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet <Integer> setB = new HashSet<>(Arrays.asList(7,3,10,5));
        HashSet <Integer> setC = new HashSet<>(setA); //создали копию setA
//        setC.addAll(setB);// объединение множеств
//        setC.retainAll(setB);//пересечение множеств
        setC.removeAll(setB);//разность множеств


        System.out.println(setC);


    }
}
