package HW_fruits;

public class Apple extends Fruit{

    public Apple(int amount) {
        super(1.0f, amount);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "Вес одного яблока = " + super.getWeight() +
                ", количество яблок = " + super.getAmount() +
                '}';
    }
}
