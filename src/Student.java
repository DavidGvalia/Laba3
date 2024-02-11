public class Student {
    private String name;
    private String surname;
    private String patronymic;
    double averageGrade;
    int attendance;

    public Student(String name, String surname, String patronymic, double averageGrade, int attendance){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.averageGrade = averageGrade;
        this.attendance = attendance;
    }

    public String getFullName(){
        return surname + " " + name + " " + patronymic;
    }
    public String getName(){
        return name;
    }
    public double getAverageGrade(){
        return averageGrade;
    }
    public int getAttendance(){
        return attendance;
    }
    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
