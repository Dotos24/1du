import java.util.HashMap;

class StudentDatabase {
    private HashMap<String, Student> students;

    public StudentDatabase() {
        students = new HashMap<>();
    }

    // Додавання студента
    public void addStudent(Student student) {
        students.put(student.surname, student);
    }

    // Видалення студента
    public boolean removeStudent(String surname) {
        if (students.containsKey(surname)) {
            students.remove(surname);
            return true;
        }
        return false;
    }

    // Пошук студента за прізвищем
    public Student findStudentBySurname(String surname) {
        return students.get(surname);
    }

    // Виведення всіх студентів
    public void displayAllStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
}

// Головний клас для демонстрації
public class Mainc {
    public static void main(String[] args) {
        StudentDatabase db = new StudentDatabase();

        // Додавання студентів
        db.addStudent(new Student("John", "Doe", 20, 2, 4.5));
        db.addStudent(new Student("Jane", "Smith", 22, 3, 4.7));

        // Виведення всіх студентів
        System.out.println("Список студентів:");
        db.displayAllStudents();

        // Пошук студента за прізвищем
        System.out.println("\nШукаємо студента з прізвищем 'Doe':");
        Student student = db.findStudentBySurname("Doe");
        System.out.println(student != null ? student : "Не знайдено");

        // Видалення студента
        db.removeStudent("Smith");

        // Виведення всіх студентів після видалення
        System.out.println("\nСписок студентів після видалення:");
        db.displayAllStudents();
    }
}
