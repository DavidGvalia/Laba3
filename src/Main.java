import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Иван", "Иванов", "Иванович", 4.5, 90));
        students.add(new Student("Петр", "Петров", "Петрович", 4.0, 80));
        students.add(new Student("Сидор", "Сидоров", "Сидорович", 3.5, 70));

        // Находим студента с максимальным средним баллом
        Student maxGradeStudent = Collections.max(students, Comparator.comparing(Student::getAverageGrade));
        System.out.println("Студент с максимальным средним баллом: " + maxGradeStudent.getFullName());

        // Подсчитываем количество студентов с посещаемостью меньше среднего
        int totalAttendance = students.stream().mapToInt(Student::getAttendance).sum();
        double averageAttendance = (double) totalAttendance / students.size();
        long belowAverageAttendanceCount = students.stream().filter(s -> s.getAttendance() < averageAttendance).count();
        System.out.println("Количество студентов с посещаемостью меньше среднего: " + belowAverageAttendanceCount);

        // Упорядочиваем список по именам
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Отсортированный список студентов по именам: ");
        for (Student student : students) {
            System.out.println(student.getFullName());
        }

        // Поиск по ФИО студента, исправление одного из полей и вывод полной информации о студенте после редактирования
        String searchName = "Иван";
        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                student.setAverageGrade(4.8); // Изменяем средний балл
                System.out.println("Полная информация о студенте после редактирования: " + student.getFullName() + ", " + student.getAverageGrade() + ", " + student.getAttendance());
                break;
            }
        }
    }
}