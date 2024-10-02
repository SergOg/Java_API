package seminar4;

import java.util.LinkedList;

class ListUtils {
    public static int countOccurrences(LinkedList<String> list, String value) {
// Напишите свое решение ниже
        int count = 0;
        for (String s:
             list) {
            if (s.equals(value)){
                count++;
            }
        }
        return count;
    }
}
