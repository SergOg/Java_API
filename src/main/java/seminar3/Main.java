package seminar3;

import java.util.Arrays;

//Задание 1. Удаление отрицательных значений из массива
//Реализуйте метод, который принимает на вход целочисленный массив и
//удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
//только неотрицательные числа
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {-1, 2, -3, 4, -5, 6};
        int[] arr2 = {1, 2, 2, 3, 4, 4, 5};
        String[] arr3 = {"cat", "elephant", "dog", "giraffe"};
        int[] arr4 = {4, 2, 7, 5, 1};

        FilterNegative answer = new FilterNegative();
        String itresume_res = Arrays.toString(answer.filterNegative(arr1));
        System.out.println(itresume_res);

//Задача 2. Уникальные числа
//Напишите метод, который принимает целочисленный массив и возвращает
//новый массив, содержащий только уникальные элементы из исходного
//массива
        UniqueElements answer1 = new UniqueElements();
        //String itresume_res1 = Arrays.toString(answer1.getUniqueElements(arr2));
        System.out.println(answer1.getUniqueElements(arr2));

//Задача 3. Длина слов
//Реализуйте метод, который принимает на вход массив строк и возвращает
//новый массив, содержащий только строки, длина которых больше 3 символов
        FilterStrings answer2 = new FilterStrings();
        String itresume_res2 = Arrays.toString(answer2.filterShortStrings(arr3));
        System.out.println(itresume_res2);

//Задача 4*. Среднее значение массива
//Напишите метод, который принимает массив целых чисел и возвращает
//среднее значение элементов массива, округленное до ближайшего целого
//числа.
        AverageCalculator answer3 = new AverageCalculator();
        int result3 = answer3.calculateAverage(arr4);
        System.out.println(result3);

    }
}
