import java.util.Deque;
import java.util.LinkedList;

class DequeTasks {
    public static void rotateDeque(Deque<Integer> deque, int n) {
        int size = deque.size();
        if (size == 0) return;

        n = n % size; // Упрощаем количество вращений
        if (n < 0) {
            n += size; // Преобразуем отрицательное значение в эквивалентное положительное
        }

        for (int i = 0; i < n; i++) {
            deque.addFirst(deque.removeLast());
        }
    }
}

public class Printer {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        int n;
        if (args.length < 1) {
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);
            n = 2;
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                deque.add(Integer.parseInt(args[i]));
            }
            n = Integer.parseInt(args[args.length - 1]);
        }
        DequeTasks.rotateDeque(deque, n);
        System.out.println(deque);
    }
}
