package HW_fruits;

public abstract class Fruit {

    private final float weight;
    private int amount;


    public Fruit(float weight, int amount) {
        this.weight = weight;
        this.amount = amount;
    }

    public float getWeight() {

        return weight * amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addAmount(int amount) {
        this.amount += amount;
    }




    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", amount=" + amount +
                '}';
    }
}
