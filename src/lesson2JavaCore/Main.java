package lesson2JavaCore;

import static lesson2JavaCore.Array.arraySum;

public class Main {

    public static void main(String[] args) throws MyArraySizeException {
        Array array = new Array();
        Array sum = new Array();
        String[][] incorrectArr1 = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        String[][] incorrectArr2 = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1"}
        };
        String[][] incorrectArr3 = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "err", "1"}
        };

        try {
            array.arrayException(incorrectArr1);
            array.arrayException(incorrectArr2);
            System.out.println(arraySum(incorrectArr3));
        } catch (MyArraySizeException | MyArrayDataException exception) {
            exception.printStackTrace();
        }
    }
}
