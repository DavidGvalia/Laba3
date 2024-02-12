public class Student extends Person {
    double averageGrade;
    int attendance;

    public Student(String surname, String name, String patronymic, double averageGrade, int attendance){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.averageGrade = averageGrade;
        this.attendance = attendance;
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
