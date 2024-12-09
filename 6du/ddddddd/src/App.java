import java.util.ArrayList;

// Клас Student
class Student {
    String name;
    String surname;
    int age;
    int course;
    double averageMark;

    public Student(String name, String surname, int age, int course, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", averageMark=" + averageMark +
                '}';
    }
}

// Клас для управління базою даних студентів
class StudentDatabase {
    private ArrayList<Student> students;

    public StudentDatabase() {
        students = new ArrayList<>();
    }

    // Додавання студента
    public void addStudent(Student student) {
        students.add(student);
    }

    // Видалення студента
    public boolean removeStudent(String surname) {
        return students.removeIf(student -> student.surname.equals(surname));
    }

    // Пошук студента за прізвищем
    public Student findStudentBySurname(String surname) {
        for (Student student : students) {
            if (student.surname.equals(surname)) {
                return student;
            }
        }
        return null;
    }

    // Оновлення даних студента
    public boolean updateStudent(String surname, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).surname.equals(surname)) {
                students.set(i, updatedStudent);
                return true;
            }
        }
        return false;
    }

    // Виведення всіх студентів
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

// Головний клас для демонстрації
public class App {
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

        // Оновлення студента
        db.updateStudent("Doe", new Student("John", "Doe", 21, 3, 4.8));

        // Виведення всіх студентів після оновлення
        System.out.println("\nСписок студентів після оновлення:");
        db.displayAllStudents();

        // Видалення студента
        db.removeStudent("Smith");
        
        // Виведення всіх студентів після видалення
        System.out.println("\nСписок студентів після видалення:");
        db.displayAllStudents();
    }
}
