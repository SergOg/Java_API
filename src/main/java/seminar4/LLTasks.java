package seminar4;

import java.util.LinkedList;

public class LLTasks {
    public static void removeOddLengthStrings(LinkedList<String> ll) {
// Напишите свое решение ниже
//Задание 1. Удаление нечетных строк
        LinkedList<String> remove = new LinkedList<String>();
        for (String s:
             ll) {
            if (s.length() % 2 != 0){
                remove.add(s);
            }
        }
        ll.removeAll(remove);
    }
}
