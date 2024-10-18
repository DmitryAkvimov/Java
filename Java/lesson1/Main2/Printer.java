class Answer {
    public static void printEvenNums() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i); // Вывод четного числа
        }
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.printEvenNums(); // Вывод всех четных чисел
    }
}
