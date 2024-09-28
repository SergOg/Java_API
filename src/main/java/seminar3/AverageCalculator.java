package seminar3;

public class AverageCalculator {
    public static int calculateAverage(int[] a) {
// Напишите свое решение ниже
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        if (sum == 0) return 0;
        return (int) Math.round((double) sum / a.length);
    }
}
