package seminar6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static Map<String, Object> menu() {
        Map<Integer, String> param = new HashMap<Integer, String>();
        param.put(1, "Объем памяти");
        param.put(2, "Объем диска");
        param.put(3, "Операционная система");
        param.put(4, "Цвет");
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();
        boolean continueFiltering = true;
        while (continueFiltering) {
            System.out.println("Задайте критерии поиска:");
            for (Map.Entry<Integer, String> entry : param.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
            int criterion = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера от символа новой строки
            switch (criterion) {
                case 1:
                    System.out.print("Введите минимальное значение памяти (в ГБ): ");
                    filters.put("ram", scanner.nextInt());
                    scanner.nextLine(); // Очистка буфера от символа новой строки
                    break;
                case 2:
                    System.out.print("Введите минимальное значение объема диска (в ГБ): ");
                    filters.put("hdd", scanner.nextInt());
                    scanner.nextLine(); // Очистка буфера от символа новой строки
                    break;
                case 3:
                    System.out.print("Введите операционную систему: ");
                    filters.put("os", scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Задайте цвет: ");
                    filters.put("color", scanner.nextLine());
                    break;
                default:
                    System.out.println("Некорректный критерий..");
            }
            System.out.print("Хотите добавить еще параметры? (y/n): ");
            String response = scanner.nextLine();
            continueFiltering = response.equalsIgnoreCase("y");
        }
        return filters;
    }
}
