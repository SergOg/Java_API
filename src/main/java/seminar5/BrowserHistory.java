package seminar5;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class BrowserHistory {
    // Напишите свое решение ниже
    Deque<String> deque = new ArrayDeque<>();

    public void visitSite(String site) {
// Напишите свое решение ниже
        deque.addFirst(site);
    }

    public String back(int steps) {
        if (steps >= deque.size()) {
            return null;
        }
// Напишите свое решение ниже
//        deque.stream().skip(steps);
//        return deque.getFirst();
        return deque.stream().skip(steps).findFirst().orElse(null);
    }

    public Deque<String> getHistory() {
// Напишите свое решение ниже
        return deque;
    }
}
