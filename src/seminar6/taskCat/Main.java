package seminar6.taskCat;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Сибирская", LocalDate.of(2010,10,3), "Иванов Е.А.");
        cat.addVaccination(new Vaccination(LocalDate.now(),"От бешенства"));
        cat.addVaccination(new Vaccination(LocalDate.of(2015,5,4),"От насморка"));
        cat.addVaccination(new Vaccination(LocalDate.of(2020,10,3),"Витаминный комплекс"));
        System.out.println(cat);

        Cat cat2 = new Cat("Мурзик", "Сиамская", LocalDate.of(2011,1,13), "Петрова О.Е.");
        cat2.addVaccination(new Vaccination(LocalDate.of(2020,6,1),"От насморка"));
        cat2.addVaccination(new Vaccination(LocalDate.of(2018,10,3),"Витаминный комплекс"));

        ArrayList <Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat2);
        System.out.println(cats);

        for (Cat ca : cats) {
            System.out.println(ca);

        }






    }
}
