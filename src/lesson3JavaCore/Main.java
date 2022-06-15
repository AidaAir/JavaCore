package lesson3JavaCore;

import java.util.Arrays;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"1", "2", "3", "4", "5"};
        changeArr(arr, 1, 4);
        System.out.println(Arrays.toString(arr));

    }

    public static void changeArr(Object[] array, int a, int b) {
        Object temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        printArray(array);
    }

}
