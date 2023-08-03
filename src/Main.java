import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] array = generateRandomArray();
        int totalExpenses = 0;
        for (int value : array) {
            totalExpenses += value;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");
    }

    private static void task2() {
        System.out.println("Задача 2");
        int min = 199_000;
        int max = 0;
        int[] array = generateRandomArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] array = generateRandomArray();
        int totalExpenses = 0;
        for (int value : array) {
            totalExpenses += value;
        }
        double averageExpense = (double) totalExpenses / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей.");
    }

    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            int middle = reverseFullName.length / 2;
            if (i == middle) {
                break;
            }
            char temporaryValue = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temporaryValue;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}