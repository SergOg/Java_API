package seminar4;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1. Удаление нечетных строк");
        LinkedList<String> ll = new LinkedList<>();
        if (args.length == 0) {
            ll.add("apple");
            ll.add("banana");
            ll.add("pear");
            ll.add("grape");
        } else {
            for (String arg : args) {
                ll.add(arg);
            }
        }
        LLTasks answer = new LLTasks();
        System.out.println(ll);
        answer.removeOddLengthStrings(ll);
        System.out.println(ll);

        System.out.println("Задача 2. Реализация стека.");
        MyStack stack = new MyStack();

        if (args.length == 0) {
            stack.push("apple");
            stack.push("banana");
            stack.push("pear");
            stack.push("grape");
        } else {
            for (String arg : args) {
                stack.push(arg);
            }
        }
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());

        System.out.println("Задача 3. Количество вхождений слова");
        LinkedList<String> list = new LinkedList<>();
        String value;

        if (args.length < 2) {
            list.add("apple");
            list.add("banana");
            list.add("apple");
            list.add("pear");
            list.add("banana");
            value = "apple";
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                list.add(args[i]);
            }
            value = args[args.length - 1];
        }
        ListUtils utils = new ListUtils();
        System.out.println("Occurrences of \"" + value + "\": " + utils.countOccurrences(list, value));

        System.out.println("Задача 4. Сдвиг очереди");
        Deque<Integer> deque = new LinkedList<>();
        int n;

        if (args.length < 1) {
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);
            n = -2;
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                deque.add(Integer.parseInt(args[i]));
            }
            n = Integer.parseInt(args[args.length - 1]);
        }
        System.out.println(deque);
        DequeTasks.rotateDeque(deque, n);
        System.out.println(deque);
    }
}