package lesson3JavaCore;

public class FruitBoxInfo {
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box(2.1);
        Box<Apple> appleBox2 = new Box<>(3.4);
        Box<Orange> orangeBox = new Box<>(5);

        for (int i = 0; i < 5; i++) {
            appleBox1.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
            orangeBox.addFruit(new Orange());
        }

        System.out.println("Вес коробки с яблоками: " + appleBox1.getWeightBox() + "Количество яблок в коробке: ");
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeightBox());
        System.out.println("Вес коробки с яблоками равен весу коробки с апельсинами? " + appleBox1.compare(orangeBox));

        appleBox1.addFruits(appleBox2);
    }
}
