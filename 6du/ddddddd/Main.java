import java.util.LinkedList;

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
    private LinkedList<Student> students;

    public StudentDatabase() {
        students = new LinkedList<>();
    }

    // Додавання студента на початок списку
    public void addStudentFirst(Student student) {
        students.addFirst(student);
    }

    // Додавання студента в кінець списку
    public void addStudentLast(Student student) {
        students.addLast(student);
    }

    // Видалення першого студента
    public Student removeFirstStudent() {
        return students.pollFirst();
    }

    // Видалення останнього студента
    public Student removeLastStudent() {
        return students.pollLast();
    }

    // Виведення всіх студентів
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

// Головний клас для демонстрації
public class Main {
    public static void main(String[] args) {
        StudentDatabase db = new StudentDatabase();

        // Додавання студентів
        db.addStudentLast(new Student("John", "Doe", 20, 2, 4.5));
        db.addStudentFirst(new Student("Jane", "Smith", 22, 3, 4.7));

        // Виведення всіх студентів
        System.out.println("Список студентів:");
        db.displayAllStudents();

        // Видалення першого студента
        System.out.println("\nВидаляємо першого студента:");
        db.removeFirstStudent();
        db.displayAllStudents();

        // Видалення останнього студента
        System.out.println("\nВидаляємо останнього студента:");
        db.removeLastStudent();
        db.displayAllStudents();
    }
}
