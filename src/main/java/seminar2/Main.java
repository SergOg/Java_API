package seminar2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса
        StringBuilder sb = new StringBuilder("select * from students where ");
        String[][] arrWhere = {{"name", "country", "city", "age"}, {"Ivanov", "Russia", "Moscow", "null"}};

        int[] arrInt = {1, 6, 5, 9, 0, 3, 2, 7, 3, 1};


        //logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        for (int i = 0; i < 4; i++) {
            if (i != 3) {
                if (requestNull(arrWhere[1][i])) {
                    sb.append(arrWhere[0][i]);
                    sb.append(" = ");
                    sb.append(arrWhere[1][i]);
                    sb.append(" AND ");
                }
            } else {
                if (requestNull(arrWhere[1][i])) {
                    sb.append(arrWhere[0][i]);
                    sb.append(" = ");
                    sb.append(arrWhere[1][i]);
                } else sb.delete(sb.length() - 5, sb.length()); //sb.deleteCharAt(sb.lastIndexOf("AND"));
            }
        }
        sb.append(";");
        System.out.println(sb);
//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл
        bubbleSort(arrInt);
        //logger.log(Level.INFO, String.valueOf(arrInt[1]));
        showArr(arrInt);

//Задание 1. Формирование URL с параметрами
        String baseURL = "";
        String params = "";
        if (args.length == 0) {
            baseURL = "https://example.com/search?";
            params = "query=java&sort=desc&filter=null";
        } else {
            baseURL = args[0];
            params = args[1];
        }
        URLBuilder ans = new URLBuilder();
        System.out.println(ans.buildURL(baseURL, params));

//Задача 2. Создание CSV-строки из массива объектов
        String[] headers = {};
        String[][] data = {};
        headers = new String[]{"Name", "Age", "City"};
        data = new String[][] {
                {"John", "30", "New York"},
                {"Alice", "25", "Los Angeles"},
                {"Bob", "35", "Chicago"}
        };
        CSVGenerator ans1 = new CSVGenerator();
        System.out.println(ans1.generateCSV(headers, data));

//Задача 3. Удаление пустых строк из текста
        String text = "line1\n\nline2\n\nline3";
        TextCleaner ans2 = new TextCleaner();
        System.out.println(ans2.removeEmptyLines(text));

//Задача 4. Логирование операций с массивом во время поиска минимального и максимального элементов
        int[] arr = new int[]{9, 4, 8, 3, 1};

        ArrayOperations ans3 = new ArrayOperations();

        ans3.findMinMax(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log1.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean requestNull(String s) {
        if (s.equals("null")) return false;
        return true;
    }

    public static void bubbleSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                    logger.log(Level.INFO, String.valueOf(sortArr[j]));
                }
            }
        }
    }

    public static void showArr(int[] arr) {
        for (int e : arr
        ) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
