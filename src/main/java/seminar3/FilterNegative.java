package seminar3;

import java.util.ArrayList;

public class FilterNegative {
    public static int[] filterNegative(int[] a) {
// Напишите свое решение ниже
        ArrayList<Integer> sb = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                sb.add(a[i]);
            }
        }
        int[] resultArray = new int[sb.size()];
        for (int i = 0; i < sb.size(); i++) {
            resultArray[i] = sb.get(i);
        }
        return resultArray;
    }
}
