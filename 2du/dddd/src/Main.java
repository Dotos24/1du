// Базовий клас: Випробування
class Test {
    protected String name;
    protected int maxScore;

    public Test(String name, int maxScore) {
        this.name = name;
        this.maxScore = maxScore;
    }

    public void displayInfo() {
        System.out.println("Випробування: " + name);
        System.out.println("Максимальний бал: " + maxScore);
    }
}

// Похідний клас: Іспит
class Exam extends Test {
    protected String subject;

    public Exam(String name, int maxScore, String subject) {
        super(name, maxScore);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Предмет: " + subject);
    }
}

// Похідний клас: Випускний іспит
class FinalExam extends Exam {
    private boolean isMandatory;

    public FinalExam(String name, int maxScore, String subject, boolean isMandatory) {
        super(name, maxScore, subject);
        this.isMandatory = isMandatory;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Обов'язковий: " + (isMandatory ? "Так" : "Ні"));
    }
}

// Похідний клас: Тестування
class Quiz extends Test {
    private int questionCount;

    public Quiz(String name, int maxScore, int questionCount) {
        super(name, maxScore);
        this.questionCount = questionCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кількість питань: " + questionCount);
    }
}

// Головний клас із методом main
public class Main {
    public static void main(String[] args) {
        Test generalTest = new Test("Загальне випробування", 100);
        Exam mathExam = new Exam("Математика", 150, "Алгебра");
        FinalExam graduationExam = new FinalExam("Випускний", 200, "Фізика", true);
        Quiz quiz = new Quiz("Швидке тестування", 50, 10);

        System.out.println("=== Інформація про випробування ===");
        generalTest.displayInfo();
        System.out.println();

        System.out.println("=== Інформація про іспит ===");
        mathExam.displayInfo();
        System.out.println();

        System.out.println("=== Інформація про випускний іспит ===");
        graduationExam.displayInfo();
        System.out.println();

        System.out.println("=== Інформація про тестування ===");
        quiz.displayInfo();
    }
}

