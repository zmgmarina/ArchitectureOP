package seminar1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private final List<Product> products;



    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    public  BottleOfWater getBottleOfWater(double volume){

        for(Product product : products){
            if (product instanceof BottleOfWater){
               if ( ((BottleOfWater)product).getVolume()  == volume){
                   return (BottleOfWater)product;
               }
            }
        }
        return null;
    }

    public  BottleOfMilk getBottleOfMilk(int fatСontent) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                if ((((BottleOfMilk) product).getFatСontent() == fatСontent)) {
                    return (BottleOfMilk) product;
                }
            }
        }
        return null;
    }

    public  Chips getChips(String flavored) {
        for (Product product : products) {
            if (product instanceof Chips) {
                if ((((Chips) product).getFlavored() == flavored)) {
                    return (Chips) product;
                }
            }
        }
        return null;
    }





}
