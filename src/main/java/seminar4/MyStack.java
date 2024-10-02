package seminar4;
// push(String element) - добавляет элемент на вершину стека
// pop() - возвращает элемент с вершины и удаляет его
// peek() - возвращает элемент с вершины, не удаляя
// getElements() - возвращает все элементы стека
import java.util.LinkedList;

class MyStack {
    // Напишите свое решение ниже
    private LinkedList<String> stack = new LinkedList<>();

    public void push(String element) {
// Напишите свое решение ниже
        stack.add(element);
    }
    public String pop() {
// Напишите свое решение ниже
        return stack.removeLast();
    }
    public String peek() {
// Напишите свое решение ниже
        if (stack.size() == 0)
            throw  new RuntimeException("Stack is empty");
        return stack.peekLast();
    }
    public LinkedList<String> getElements() {
// Напишите свое решение ниже
        return stack;
    }
}