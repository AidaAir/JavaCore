package lesson4JavaCore;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayList {

    public static void main(String[] args) {

        Set<String> list = new LinkedHashSet<>(Arrays.asList("Chair", "Table", "Lamp", "Phone", "Cable", "Cup", "Laptop", "Pen", "Notebook", "Headphones", "Cup", "Lamp", "Chair"));
        System.out.println(list);
        System.out.println(list.size());
    }
}
