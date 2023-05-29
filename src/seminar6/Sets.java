package seminar6;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat("Барсик", "Белый"));
        cats.add(new Cat("Барсик", "Серый"));
        cats.add(new Cat("Мурзик", "Белый"));
        cats.add(new Cat("Барсик", "Белый"));

        System.out.println(cats);

        Cat cat = new Cat("Том", "Сфинкс");
        cat.sayMeow();
        cat.sayMeow();




    }
}

