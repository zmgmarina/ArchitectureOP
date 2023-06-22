package HW_fruits;

public  abstract class BoxFruits <F extends Fruit> {

    private float weight;

    public BoxFruits(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
