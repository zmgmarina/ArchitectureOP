package HW_fruits;

public class Orange extends Fruit{

    public Orange(int amount) {
        super(1.5f , amount);
    }
    @Override
    public String toString() {
        return "Orange{" +
                "Вес одного апельсина = " + super.getWeight() +
                ", количество апельсинов = " + super.getAmount() +
                '}';
    }
}
