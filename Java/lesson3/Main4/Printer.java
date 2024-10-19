import java.util.Arrays;

class AverageCalculator {
    public static int calculateAverage(int[] a) {
        if (a.length == 0) return 0; // Защита от пустого массива
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return Math.round((float) sum / a.length);
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[]{4, 2, 7, 5, 1};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        AverageCalculator answer = new AverageCalculator();
        int result = answer.calculateAverage(a);
        System.out.println(result);
    }
}
