import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentAddRemove {

    private List<Student> students; // создаем список студентов
    private List<Student> expelledStudents; // отчисленные студенты
    private List<Student> promotedStudents; // студенты, переведенные на следующий курс
    // вызываем конструктор
    public StudentAddRemove() {
        this.students = new ArrayList<>();
        this.expelledStudents = new ArrayList<>();
        this.promotedStudents = new ArrayList<>();
    }

    // добавление нового студента через метод addStudent()
    public void addStudent(Student student) {
        students.add(student);
    }

    // удаляем студентов со средним баллом < 3
    public void removeStudent() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getMeanGrade() < 3) {
                expelledStudents.add(student); // Добавляем отчисленного студента в отдельный список
                iterator.remove();
            } else {
                student.setLevel(student.getLevel() + 1); // Переводим студента на следующий курс
                promotedStudents.add(student); // Добавляем переведенного студента в отдельный список
            }
        }
    }

    public void printExpelledStudents() {
        System.out.println("Отчисленные студенты:");
        for (Student student : expelledStudents) {
            System.out.println(student.getName() + " - уровень: " + student.getLevel());
        }
    }

    public void printPromotedStudents() {
        System.out.println("Переведенные студенты:");
        for (Student student : promotedStudents) {
            System.out.println(student.getName() + " - уровень: " + student.getLevel());
        }
    }

    // выводим в терминал студентов через метод printStudents()
    public void printStudents(int course) {
        System.out.println("Студенты курса " + course + ":");
        for (Student student : students) {
            if (student.getLevel() == course) {
                System.out.println(student.getName());
            }
        }
    }
}