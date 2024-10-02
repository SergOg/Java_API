package seminar4;

import java.util.Deque;

class DequeTasks {
    public static void rotateDeque(Deque<Integer> deque, int n) {
// Напишите свое решение ниже
        n = n % deque.size();
        if (n < 0) n = n + deque.size();
        if (!deque.isEmpty()){
            for (int i = 0; i < n; i++) {
                deque.addLast(deque.removeFirst());
            }
        }
    }
}
