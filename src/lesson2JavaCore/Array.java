package lesson2JavaCore;

public class Array {

    public void arrayException(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Array's lines length is unacceptable");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException(String.format("Unaccepted amount of columns in %d" +
                    " line", i));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int arraySum(String[][] arrSum) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arrSum.length; i++) {
            for (int j = 0; j < arrSum[i].length; j++) {
                try {
                    sum += Integer.parseInt(arrSum[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException("Invalid data in cell " + "[" + i + "]" + "[" + j + "]");
                }
            }
        }
        return sum;
    }
}



