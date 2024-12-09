public class App {
    public static void main(String[] args) {
        try {
            // Створюємо масив з трьох елементів
            int[] arr = {1, 2, 3};
            
            // Спроба звернутись до елементу за межами масиву
            System.out.println(arr[5]); // Цей рядок викличе IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
