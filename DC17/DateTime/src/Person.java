import java.time.*;

public class Person {
    private int age;
    private LocalDate birthday;
    private String firstname;
    private String surname;

    public void setAll(String name1, String name2, LocalDate birthdate){
        setAge(birthdate);
        setFirstname(name1);
        setSurname(name2);
    }

    public void setFirstname(String name){
        firstname = name;
    }

    public void setSurname(String name){
        surname = name;
    }

    public void setAge(LocalDate birthdate){
        birthday = birthdate;
        LocalDate today = LocalDate.now();
        Period timeBetween = Period.between(birthday,today);
        age = timeBetween.getYears();
    }

    public String getFirstname(){
        return firstname;
    }

    public String getSurname(){
        return surname;
    }

    public String getFullname(){
        return getFirstname() + " " + getSurname();
    }

    public int getAge(){
        return age;
    }

    public String getBirthdate(){
        return birthday.toString();
    }

    public String compareAge(Person user2){
        Period ageDiff;
        if (this.getAge() > user2.getAge()){
            ageDiff = Period.between(this.birthday, user2.birthday);
        } else {
            ageDiff = Period.between(user2.birthday, this.birthday);
        }
        int yrDiff = ageDiff.getYears();
        int moDiff = ageDiff.getMonths();
        int daDiff = ageDiff.getDays();
        String totalDiff = yrDiff + " years, " + moDiff + " months and " + daDiff + " days.";
        if (this.getAge() > user2.getAge()){
            return this.getFullname() + " is older than " + user2.getFullname() + " by " + totalDiff;
        } else {
            return user2.getFullname() + " is older than "+ this.getFullname() + " by " + totalDiff;
        }

    }

}
