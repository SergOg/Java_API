package seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArrayOperations {
    private static File log1;
    private static FileWriter fileWriter;

    public static void findMinMax(int[] arr) {

        try {
            log1 = new File("log1.txt");
            log1.createNewFile();
            fileWriter = new FileWriter(log1);
            int min = arr[0];
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
                logStep(min, max);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void logStep(int min, int max) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String timestamp = dateFormat.format(new Date());
            fileWriter.write(timestamp + " " + min + ", " + max + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
