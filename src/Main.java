import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentAddRemove control = new StudentAddRemove();

        // ��������� ���������
        control.addStudent(new Student("�������� ���������� ���������", "������ 544", 1, Arrays.asList(3, 4, 3, 5, 3)));
        control.addStudent(new Student("������� ���� �������������", "������ 543", 3, Arrays.asList(2, 3, 5, 4)));
        control.addStudent(new Student("������ ����� ���������", "������ 544", 1, Arrays.asList(4, 5, 4, 5)));
        control.addStudent(new Student("������ ������� ��������������", "������ 534", 3, Arrays.asList(4, 5, 4, 3, 3)));
        control.addStudent(new Student("����������� ������ ���������", "������ 534", 1, Arrays.asList(3, 5, 3, 4)));
        control.addStudent(new Student("��������� ������� ����������", "������ 544", 4, Arrays.asList(3, 3, 5, 5)));
        control.addStudent(new Student("��������� ������ ����������", "������ 545", 1, Arrays.asList(2, 2, 3)));
        control.addStudent(new Student("��������� ����� �����������", "������ 543", 1, Arrays.asList(3, 5, 5, 5, 4)));
        control.addStudent(new Student("������� ����� ���������", "������ 542", 4, Arrays.asList(4, 4, 4, 4)));
        control.addStudent(new Student("����������� ������� ��������", "������ 543", 3, Arrays.asList(3, 4, 5, 4, 3)));
        control.addStudent(new Student("�������� ������ ���������", "������ 545", 2, Arrays.asList(2, 2, 2)));
        control.addStudent(new Student("�������� ������ ����������", "������ 545", 1, Arrays.asList(5, 5, 5, 5, 5, 5, 5)));

        // ��������� ���������
        control.removeStudent();
        // ������ ��������� 1 �����
        control.printStudents(1);
        // ������ ��������� 2 �����
        control.printStudents(2);
        // ������ ������ ����������� ���������
        control.printExpelledStudents();
        // ������ ������ ������������ �� ��������� ���� ���������
        control.printPromotedStudents();
    }
}