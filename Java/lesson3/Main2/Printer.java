import java.util.Arrays;
import java.util.LinkedHashSet;

class UniqueElements {
    public static int[] getUniqueElements(int[] a) {
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : a) {
            uniqueSet.add(num);
        }
        // Преобразуем LinkedHashSet в массив
        int[] resultArray = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            resultArray[i++] = num;
        }
        return resultArray;
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[]{1, 2, 2, 3, 4, 4, 5};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        UniqueElements answer = new UniqueElements();
        String itresume_res = Arrays.toString(answer.getUniqueElements(a));
        System.out.println(itresume_res);
    }
}
