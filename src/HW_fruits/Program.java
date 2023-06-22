package HW_fruits;

import java.util.ArrayList;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {

        ArrayList <Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple(0));
        fruits.add(new Orange(0));

        Box<Fruit> box = new Box<>(fruits);// создали коробку с фруктами
        System.out.println(box);
        
        BoxApple <Apple> boxApple = new BoxApple<>(0); // создали пустую коробку для яблок
        BoxOrange <Orange> boxOrange = new BoxOrange<>(0); // и коробку для апельсинов



        for (Fruit fruit : box.getFruits()) {
            if (fruit instanceof Apple) {
                fruit.addAmount(3);
                boxApple.setWeight(fruit.getWeight());
                System.out.printf("В коробке для яблок находится %s яблок", boxApple.getWeight());
                System.out.println();
            } else if (fruit instanceof Orange) {
                fruit.addAmount(3);
                boxOrange.setWeight(fruit.getWeight());
                System.out.printf("В коробке для апельсинов находится %s апельсинов", boxOrange.getWeight());
            }
        }

    }

























}
