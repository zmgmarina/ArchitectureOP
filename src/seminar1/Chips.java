package seminar1;

public class Chips extends Product {
    protected String flavored;

    public Chips(String brand, String name, double price, String flavored) {
        super(brand, name, price);
        this.flavored = flavored;
    }


    public String getFlavored() {
        return flavored;
    }

    public void setFlavored(String flavored) {
        this.flavored = flavored;
    }

    public String displayInfo() {
        return String.format("brand: %s, name: %s, flavored: %s, price: %f", brand, name, flavored,price);
    }
}


