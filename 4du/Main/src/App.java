import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Введення рядка
        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();
        
        // Розділення рядка на слова
        String[] words = input.split("\\s+");
        
        // Лічильник слів, що містять букву 'a'
        int count = 0;
        
        // Перевірка кожного слова на наявність букви 'a'
        for (String word : words) {
            if (word.contains("a") || word.contains("A")) {
                count++;
            }
        }
        
        // Виведення результату
        System.out.println("Кількість слів, що містять хоча б одну букву 'a': " + count);
    }
}
