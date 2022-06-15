package lesson3JavaCore;

import java.util.ArrayList;

public class Box<F> {

    private double weightFruit = 0.0;

    ArrayList<F> fruits = new ArrayList();

    public <F> Box(double weightFruit) {
        this.weightFruit = weightFruit;
    }

    public void addFruit(F fruit) {
    fruits.add(fruit);
    }

    public double getWeightBox() {
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(getWeightBox() - box.getWeightBox()) < 0.00001;
    }

    public void addFruits(Box<F> box) {
        System.out.println("В коробке 1 сейчас фруктов: " + fruits.size());
        System.out.println("В коробке 2 сейчас фруктов: " + box.fruits.size());
        fruits.addAll(box.fruits);
        box.fruits.clear();
        System.out.println("В коробке 1 после добавления фруктов: " + fruits.size());
        System.out.println("В коробке 2 после добавления фруктов: " + box.fruits.size());
    }
}
