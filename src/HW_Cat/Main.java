package HW_Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 8,0);
        Cat cat2 = new Cat("Коржик", 10,0);
        Cat cat3 = new Cat("Кузя", 7,0);
        Cat cat4 = new Cat("Алекс", 5,0);

        Plate plate = new Plate(25);

        List<Cat>cats = new ArrayList<>(Arrays.asList(cat1,cat2,cat3,cat4));

        eat(plate, cats);


    }


    public static void eat(Plate plate, List<Cat>cats) {

        for (Cat cat : cats) {
            if (plate.getFood() > cat.getAppetite()) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                cat.setSatiety(cat.getAppetite());
                if (cat.getSatiety() == cat.getAppetite()) {
                    System.out.printf("Котик %s наелся\n", cat.getName());
                    plate.info();
                }
                   if (plate.getFood() < cat.getAppetite()) {
                       while (plate.getFood() < cat.getAppetite())
                           plate.addFood();

                }
            }
        }

    }

}













