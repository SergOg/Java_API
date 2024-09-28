package seminar3;

import java.util.ArrayList;

public class FilterStrings {
    public static String[] filterShortStrings(String[] arr) {
// Напишите свое решение ниже
        ArrayList<String> str = new  ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length() > 3){
                str.add(arr[i]);
            }
        }
        return str.toArray(new String[0]);
    }
}
