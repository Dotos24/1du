import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Введення значення n
        System.out.print("Введіть n (n > 2): ");
        int n = scanner.nextInt();

        // Перевірка на коректність введеного n
        if (n <= 2) {
            System.out.println("n повинно бути більше 2.");
            return;
        }

        // Обчислення p
        double p = 1.0;
        for (int i = 2; i <= n; i++) {
            p *= (1 - 1.0 / (i * i)); // 1 - 1/i^2
        }

        // Виведення результату
        System.out.println("Результат p: " + p);
    }
}
