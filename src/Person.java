public class Person {
    protected String name;
    protected String surname;
    protected String patronymic;


    public Person(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person() {
    }
    public String getSurname(){
        return surname;
    }

    public String getFullName(){
        return surname + " " + name + " " + patronymic;
    }


}
