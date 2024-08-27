import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int current, min;

        System.out.println("Введите число:");

        current = scanner.nextInt();

        min = current;

        while (current != -1) {
            if (current < min) {
                System.out.println("Нашли число меншье!");
                min = current;
            }
            System.out.println("Введите число:");
            current = scanner.nextInt();
        }

        System.out.println("Минимум - " + min);

    }
}
