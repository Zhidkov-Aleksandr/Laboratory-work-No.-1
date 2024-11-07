import java.util.List;

public class Student {
    private String name; // имя студента
    private String group; // название группы
    public int level;  // курс
    private List<Integer> grades; // оценки

    // Формируем конструктор

    public Student(String name, String group, int level, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.level = level;
        this.grades = grades;
    }

    // Создаем геттеры и сеттеры

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getLevel() {
        return level;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // вычисляем средний балл через getMeanGrade()
    public double getMeanGrade() {
        if (grades == null || grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}