package seminarOOP_1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

//        Product product1 = new Product("ООО Родник", "Бутылка с водой 1", 105);
//        System.out.println(product1.displayInfo());
//        Product product2 = new Product("ООО Исток", "Бутылка с водой 2", 80);
//        System.out.println(product2.displayInfo());

//        BottleOfWater bottleOfWater1 =
//                new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", -90.15, 1.5);

//        System.out.println(bottleOfWater1.displayInfo());

/*
* Ниже мы апкастили объекты в тип родителького класса Product, чтобы создать список
* */
        Product bottleOfMilk1 = new BottleOfMilk("ООО Буренка", "Бутылка с молоком #1", 115.15, 1.5, 4);
        Product bottleOfMilk2 = new BottleOfMilk("ООО Долина", "Бутылка с молоком #2", 90, 1, 3);
        Product bottleOfWater1 = new BottleOfWater("ООО Исток", "Бутылка с водой 1", 80, 1.5);
        Product bottleOfWater2 = new BottleOfWater("ООО Родник", "Бутылка с водой 2", 105, 2);
        Product chips1 = new Chips("Potato", "Чипсы1", 150, "Бекон");
        Product chips2 = new Chips("Lays", "Чипсы2", 120, "Сыр");


        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(chips1);
        products.add(chips2);

        for (Product prod : products) {
            System.out.println(prod.displayInfo()); // полиморфный вызов метода

        }

        VendingMachine vendingMachine = new VendingMachine(products);




        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }


        Chips chipsResult = vendingMachine.getChips("Сыр");
        if (chipsResult != null){
            System.out.println("Вы купили:");
            System.out.println(chipsResult.displayInfo());
        }
        else {
            System.out.println("Чипсов с таким вкусом нет в автомате.");
        }


        BottleOfMilk bottleOfMilkResult = vendingMachine.getBottleOfMilk(3);
        if (bottleOfMilkResult != null){
            System.out.println(bottleOfMilkResult.displayInfo());
        }
        else {
            System.out.println("Молока с такой жирностью нет в автомате.");
        }

    }

}
