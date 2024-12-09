public class Main {
    public static void main(String[] args) {
        int a = 5, b = 10, x = 7;

        // Операції порівняння
        System.out.println("a > b: " + (a > b));          // більше
        System.out.println("a < b: " + (a < b));          // менше
        System.out.println("a >= b: " + (a >= b));        // більше або дорівнює
        System.out.println("a <= b: " + (a <= b));        // менше або дорівнює
        System.out.println("a == b: " + (a == b));        // дорівнює
        System.out.println("a != b: " + (a != b));        // не дорівнює

        // Складне порівняння
        boolean isBetween = (a < x) && (x < b);
        System.out.println("a < x < b: " + isBetween);

        // Логічна операція OR
        boolean isOutOfRange = (x < a) || (x > b);
        System.out.println("x поза діапазоном a та b: " + isOutOfRange);
    }
}
