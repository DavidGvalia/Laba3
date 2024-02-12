public class Singer extends Person{
    public int rating;

    public Singer(String name, int rating){
        this.name = name;
        this.rating = rating;

    }
    public String getName(){
        return name;
    }
    public int getRating() {
        return rating;
    }

    public void sing(String verse) {
        System.out.println(getName() + " поёт: " + verse);
    }

    public void happyBirthday() {
        System.out.println("Я, " + getName() +", от всей души поздравляю тебя с Днем рождения");
    }
}
