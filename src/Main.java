import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentAddRemove control = new StudentAddRemove();

        // Добавляем студентов
        control.addStudent(new Student("Федосеев Константин Андреевич", "Группа 544", 1, Arrays.asList(3, 4, 3, 5, 3)));
        control.addStudent(new Student("Карпова Элла Александровна", "Группа 543", 3, Arrays.asList(2, 3, 5, 4)));
        control.addStudent(new Student("Волков Абрам Оскарович", "Группа 544", 1, Arrays.asList(4, 5, 4, 5)));
        control.addStudent(new Student("Громов Аполлон Константинович", "Группа 534", 3, Arrays.asList(4, 5, 4, 3, 3)));
        control.addStudent(new Student("Овчинникова Индира Артемовна", "Группа 534", 1, Arrays.asList(3, 5, 3, 4)));
        control.addStudent(new Student("Агафонова Камилла Васильевна", "Группа 544", 4, Arrays.asList(3, 3, 5, 5)));
        control.addStudent(new Student("Коновалов Агафон Феликсович", "Группа 545", 1, Arrays.asList(2, 2, 3)));
        control.addStudent(new Student("Прохорова Адель Геннадиевна", "Группа 543", 1, Arrays.asList(3, 5, 5, 5, 4)));
        control.addStudent(new Student("Баранов Велор Борисович", "Группа 542", 4, Arrays.asList(4, 4, 4, 4)));
        control.addStudent(new Student("Александров Емельян Игоревич", "Группа 543", 3, Arrays.asList(3, 4, 5, 4, 3)));
        control.addStudent(new Student("Зиновьев Авраам Оскарович", "Группа 545", 2, Arrays.asList(2, 2, 2)));
        control.addStudent(new Student("Куликова Инесса Онисимовна", "Группа 545", 1, Arrays.asList(5, 5, 5, 5, 5, 5, 5)));

        // Обработка студентов
        control.removeStudent();
        // Печать студентов 1 курса
        control.printStudents(1);
        // Печать студентов 2 курса
        control.printStudents(2);
        // Печать список отчисленных студентов
        control.printExpelledStudents();
        // Печать список переведенных на следующий курс студентов
        control.printPromotedStudents();
    }
}