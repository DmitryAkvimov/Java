public class ArrayOperations {

    // Пример метода для выполнения операций над массивом
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        // Это точка входа для программы
        System.out.println("ArrayOperations is running...");

        // Пример работы с массивом
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int[] reversedArray = reverseArray(array);
        System.out.println("\nReversed Array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
