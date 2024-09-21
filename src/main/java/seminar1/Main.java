package seminar1;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        LocalTime now = LocalTime.now();
        System.out.print("Введите имя: ");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();

        LocalTime morning = LocalTime.parse("12:00");
        LocalTime day = LocalTime.parse("18:00");
        LocalTime evening = LocalTime.parse("23:00");
        LocalTime night = LocalTime.parse("05:00");

        if (now.isAfter(night) && now.isBefore(morning)) System.out.printf("Доброе утро, %s!", name);
        if (now.isAfter(morning) && now.isBefore(day)) System.out.printf("Добрый день, %s!", name);
        if (now.isAfter(day) && now.isBefore(evening)) System.out.printf("Добрый вечер, %s!", name);
        if (now.isAfter(evening) && now.isBefore(night)) System.out.printf("Доброй ночи, %s!", name);

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        System.out.printf("\nВведите число: ");
        int x = iScanner.nextInt();
        System.out.printf("Триугольное значение: %d , факториал: %d", tri(x), fuck(x));

//Вывести все четные числа от 1 до 100
        System.out.println("\nОт 1 до 100: ");
        oneThousand();

//Реализовать простой калькулятор
        System.out.print("\nВведите второе число: ");
        int y = iScanner.nextInt();
        System.out.print("Введите действие: ");
        char z = iScanner.next().charAt(0);
        System.out.println("Результат: " + calc(x, y, z));

//Подсчет суммы цифр числа
        Answer ans = new Answer();
        int n = 12345;
        int resume_res = ans.sumDigits(n);
        System.out.println("Сумма числа " + n + " = " + resume_res);

//Нахождение максимального из трех чисел
        int a = 7, b = 7, c = 7;
        System.out.println("Максимальное число из " + a + " " + b + " " + c + " это: " + ans.findMaxOfThree(a, b, c));

//        System.out.println("Введите выражение вида q + w = e: ");
//        String s = iScanner.next();
//        String a, a1 = null;
//        String b = null;
//        System.out.printf("Ваше выражение1: %s", s);
////        for (int i = 0; i < s.length(); i++) {
////            if (s.charAt(i) != ' ') {
////                a = a + s.charAt(i);
////            }else if (a1 == null && )
////        }
        // String[] split = s.split(" ");

        iScanner.close();
    }

    public static int tri(int a) {
        int b = 0;
        for (int i = 0; i < a + 1; i++) {
            b = b + i;
        }
        return b;
    }

    public static int fuck(int a) {
        if (a < 0) return -1;
        int b = 1;
        for (int i = 1; i < a + 1; i++) {
            b = b * i;
        }
        return b;
    }

    public static void oneThousand() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) System.out.println(i + " ");
        }
    }

    public static int calc(int x, int y, char z) {
        switch (z) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                if (y == 0) {
                    System.out.println("Деление на ноль!");
                } else return x / y;
        }
        return 0;
    }

    static class Answer {
        public int sumDigits(int n) {
            int res = 0;
            while (n > 0) {
                res += n % 10;
                n = n / 10;
            }
            return res;
        }

        // Функция для нахождения максимума из двух чисел
        public int findMaxOfTwo(int a, int b) {
            return (a > b) ? a : b;
        }

        // Функция для нахождения максимума из трех чисел
        public int findMaxOfThree(int a, int b, int c) {
            return findMaxOfTwo(findMaxOfTwo(a, b), c);
        }
    }
}


