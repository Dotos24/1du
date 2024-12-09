public class Main {
    public static void main(String[] args) {
        try {
            // Спроба привести об'єкт до невідповідного типу
            Object obj = "Текст";
            Integer num = (Integer) obj; // Цей рядок викличе ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
