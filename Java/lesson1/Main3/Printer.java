class Answer {
    public int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10; // Добавляем последнюю цифру числа к сумме
            n /= 10;       // Удаляем последнюю цифру из числа
        }
        return sum; // Возвращаем сумму цифр
    }
}

public class Printer {
    public static void main(String[] args) {
        int n = 12345; // Число по умолчанию
        if (args.length > 0) {
            n = Integer.parseInt(args[0]); // Считывание числа из аргументов
        }
        Answer ans = new Answer();
        int itresume_res = ans.sumDigits(n);
        System.out.println(itresume_res); // Вывод суммы цифр
    }
}
