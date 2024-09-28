package seminar3;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class UniqueElements {
    public static String getUniqueElements(int[] a) {
// Напишите свое решение ниже
        LinkedHashSet <String> b = new LinkedHashSet<>();
        for (int e:
             a) {
            b.add(String.valueOf(e));
        }
        String[] resultArray = b.toArray(new String[0]);
        //resultArray = b.toArray(new in[0]);
//        for (int i = 0; i < b.size(); i++) {
//            resultArray[i] = b[i];
//        }
//        String[] array = linkedHashSet.toArray(new String[0]);
        return Arrays.toString(resultArray);
    }
}
