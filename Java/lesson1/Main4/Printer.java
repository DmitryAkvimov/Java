class Answer {
    // Функция для нахождения максимума из двух чисел
    public int findMaxOfTwo(int a, int b) {
        return (a > b) ? a : b; // Тернарный оператор для сравнения
    }

    // Функция для нахождения максимума из трех чисел
    public int findMaxOfThree(int a, int b, int c) {
        // Сначала находим максимум между a и b, а затем сравниваем с c
        return findMaxOfTwo(findMaxOfTwo(a, b), c);
    }
}

public class Printer {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3; // Числа по умолчанию
        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }
        Answer ans = new Answer();
        int itresume_res = ans.findMaxOfThree(a, b, c);
        System.out.println(itresume_res); // Вывод максимального числа
    }
}
