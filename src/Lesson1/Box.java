package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitBox;

    public Box() {
        this.fruitBox = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.fruitBox = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float boxWeight = 0.0f;
        for (T fruit : fruitBox) {
            boxWeight += fruit.getFruitWeight();

        }
        return boxWeight;

    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void add(T fruit) {
        fruitBox.add(fruit);
    }

    public void move(Box<T> another) {
        if (another == this) {
            return;
        }
        another.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }
}
