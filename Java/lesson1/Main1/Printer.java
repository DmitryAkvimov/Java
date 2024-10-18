class Answer {
    public int factorial(int n) {
        if (n < 0) {
            return -1; // Факториал отрицательных чисел не существует
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i; // Умножаем числа от 2 до n
        }
        return result; // Возвращаем результат
    }
}

public class Printer {
    public static void main(String[] args) {
        int n = 5; // Число по умолчанию
        if (args.length > 0) {
            n = Integer.parseInt(args[0]); // Считывание числа из аргументов
        }
        Answer ans = new Answer();
        int itresume_res = ans.factorial(n);
        System.out.println(itresume_res); // Вывод результата
    }
}
