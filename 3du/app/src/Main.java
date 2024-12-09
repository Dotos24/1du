import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        while (true) {
            System.out.print("Введіть розмір масиву n: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Розмір масиву має бути натуральним числом!");
                }
            } else {
                System.out.println("Будь ласка, введіть ціле число.");
                scanner.next(); // очищення некоректного вводу
            }
        }

        int x = 0;
        while (true) {
            System.out.print("Введіть ціле число x: ");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            } else {
                System.out.println("Будь ласка, введіть ціле число.");
                scanner.next(); // очищення некоректного вводу
            }
        }

        int[] a = new int[n];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("a[" + (i + 1) + "]: ");
                if (scanner.hasNextInt()) {
                    a[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Будь ласка, введіть ціле число.");
                    scanner.next(); // очищення некоректного вводу
                }
            }
        }

        // Пошук першого входження x і обчислення суми
        int result = -10; // Значення за замовчуванням
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                found = true;
                result = 0;
                for (int j = i + 1; j < n; j++) {
                    result += a[j];
                }
                break;
            }
        }

        // Виведення результату
        System.out.println("Результат: " + result);
    }
}
