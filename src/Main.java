import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Класс Person__________________________________________________________________________________________________
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов", "Иванович"));
        people.add(new Person("Кологривый", "Никита", "Сергеевич"));
        people.add(new Person("Зубенко", "Михаил", "Петрович"));

        // Упорядочиваем список по именам
        Collections.sort(people, Comparator.comparing(Person::getSurname));
        System.out.println("Отсортированный список людей по именам: ");
        for (Person human : people) {
            System.out.println(human.getFullName());
        }
        System.out.println();
        //______________________________________________________________________________________________________________

        //Класс Singer__________________________________________________________________________________________________
        ArrayList<Singer> singers = new ArrayList<>();
        singers.add(new Singer("Лолита", 7));
        singers.add(new Singer("Егор Крид", 8));
        singers.add(new Singer("Лепс", 10));

        for (Singer singer : singers) {
            singer.happyBirthday();
        }

        for (Singer singer : singers) {
            singer.sing("Поставьте 5!!!!!");
        }

        // Выводим рейтинг каждого певца
        for (Singer singer : singers) {
            System.out.print("У исполнителя " + singer.getName() + " рейтинг ");
            System.out.println(singer.getRating());
        }
        System.out.println();
        //______________________________________________________________________________________________________________

        //Класс Student_________________________________________________________________________________________________
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Петров", "Петр", "Петрович", 4.0, 80));
        students.add(new Student("Сидоров", "Сидор", "Сидорович", 3.5, 70));


        // Находим студента с максимальным средним баллом
        Student maxGradeStudent = Collections.max(students, Comparator.comparing(Student::getAverageGrade));
        System.out.println("Студент с максимальным средним баллом: " + maxGradeStudent.getFullName());

        // Подсчитываем количество студентов с посещаемостью меньше среднего
        int totalAttendance = students.stream().mapToInt(Student::getAttendance).sum();
        double averageAttendance = (double) totalAttendance / students.size();
        long belowAverageAttendanceCount = students.stream().filter(s -> s.getAttendance() < averageAttendance).count();
        System.out.println("Количество студентов с посещаемостью меньше среднего: " + belowAverageAttendanceCount);

        // Упорядочиваем список по именам
        Collections.sort(students, Comparator.comparing(Student::getSurname));
        System.out.println("Отсортированный список студентов по именам: ");
        for (Student student : students) {
            System.out.println(student.getFullName());
        }

        // Поиск по ФИО студента, исправление одного из полей и вывод полной информации о студенте после редактирования
        System.out.print("Введите фамилию студента у которого вы ходите изменить средний бал: ");
        String searchName = scanner.nextLine();
        for (Student student : students) {
            if (student.getSurname().equals(searchName)) {
                System.out.println("Введите оценку студента: ");
                String input = scanner.nextLine();
                try {
                    double averageGrade = Double.parseDouble(input);
                    if (averageGrade >= 1 && averageGrade <= 5) {
                        student.setAverageGrade(averageGrade); // Изменяем средний балл
                        System.out.println("Полная информация о студенте после редактирования: " + student.getFullName() + ", " + student.getAverageGrade() + ", " + student.getAttendance());
                        break;
                    } else System.out.println("Введите корректную оценку!");
                } catch (NumberFormatException e){
                    System.out.println("Введите оценку!");
                }
            }
        }
        //______________________________________________________________________________________________________________
    }
}