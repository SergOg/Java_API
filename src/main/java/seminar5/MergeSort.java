package seminar5;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] left, int[] right, int[] result) {
// Введите свое решение ниже

//        int i = 0, j = 0, k = 0;
//// Объединение элементов из массива left и right в массив result
//        while (i < left.length && j < right.length) {
//            if (left[i] <= right[j]) {
//                result[k++] = left[i++];
//            } else {
//                result[k++] = right[j++];
//            }
//        }
//
//        // Копирование оставшихся элементов из массива left (если есть)
//        while (i < left.length) {
//            result[k++] = left[i++];
//        }
//
//        // Копирование оставшихся элементов из массива right (если есть)
//        while (j < right.length) {
//            result[k++] = right[j++];
//        }
        int i = 0, j = 0;
        for (int k = 0; k < result.length; k++) {
            if (i > left.length - 1) {
                result[k] = right[j++];
            } else if (j > right.length - 1) {
                result[k] = left[i++];
            } else if (left[i] < right[j]) {
                result[k] = left[i++];
            } else result[k] = right[j++];
        }
    }

    public static void mergeSort(int[] array) {
// Введите свое решение ниже
        if (array.length < 2) {
            return; // Массив с одним элементом уже отсортирован
        }
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

        // Рекурсивная сортировка двух половин
        mergeSort(left);
        mergeSort(right);
        // Объединение отсортированных половин
        merge(left, right, array);
    }
}
