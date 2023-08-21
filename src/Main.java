import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sum = Arrays.stream(generateRandomArray()).sum();

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int max = Arrays.stream(generateRandomArray())
                .max()
                .getAsInt();

        int min = Arrays.stream(generateRandomArray())
                .min()
                .getAsInt();

        System.out.println("Минимальная сумма трат составила " + min + " рублей");
        System.out.println("Максимальная сумма трат составила " + max + " рублей");

        double summ = 0;
        for (int x: generateRandomArray()) {
            summ += x;
        }
        System.out.println("Средняя сумма трат за месяц составила " + summ/generateRandomArray().length + " рублей");


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String result = "";
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            result = result + reverseFullName[i];
                   }
        System.out.println(result);

    }





    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    }


