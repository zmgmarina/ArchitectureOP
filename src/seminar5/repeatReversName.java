package seminar5;
// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.*;

public class repeatReversName {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Антон");
//        names.add("Олег");
//        names.add("Иван");
//        names.add("Антон");
//        names.add("Иван");
//        names.add("Иван");
//        names.add("Сергей");
//
//        System.out.println(names);
//
//        List<String> name = new ArrayList<>();
//        List<Integer> repeatCount = new ArrayList<>();
//
//        for (String item : names){
//            if (!name.contains(item)){
//                name.add(item);
//                repeatCount.add(1);
//            }
//            else {
//                int index = names.indexOf(item);   //находим индекс имени методом indexOf
//                repeatCount.set(index, repeatCount.get(index)+1);
//            }
//        }
//        System.out.println(name);
//        System.out.println(repeatCount);
//
//        HashMap <String, Integer> repeatName = new LinkedHashMap<String, Integer>();
//
//        for (int i = 0; i < name.size(); i++) {
//            repeatName.put(name.get(i), repeatCount.get(i));
//        }
//
//        System.out.println(repeatName);
//
//
            //НЕ ПОНЯЛА АЛГОРИТМ КОДА С ИНЕТА
            String[] nameWorkers = {"Иван", "Петр", "Антон", "Сергей", "Иван",
                    "Антон", "Иван", "Антон", "Иван", "Петр", "Антон", "Сергей", "Антон", "Антон"};
            HashMap<String, Integer> workers = new HashMap<>();
            for (String i : nameWorkers) {
                int newValue = workers.getOrDefault(i, 0) + 1;
                workers.put(i, newValue);
            }
            System.out.println(workers);


        }









}
