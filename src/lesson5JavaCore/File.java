package lesson5JavaCore;

import java.util.Arrays;

public class File {

    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("homeWork.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_homeWork.csv");
    }
}
