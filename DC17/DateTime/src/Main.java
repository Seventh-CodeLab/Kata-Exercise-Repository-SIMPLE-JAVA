import java.time.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person per1 = new Person();
        per1.setAll("Krister","Emanuelsen",LocalDate.parse("1997-11-14"));
        System.out.println(per1.getFullname() + " was born: " + per1.getBirthdate() + " and is now " + per1.getAge());
        Person per2 = new Person();
        per2.setAll("Barack","Obama",LocalDate.parse("1961-08-04"));
        System.out.println(per2.getFullname() + " was born: " + per2.getBirthdate() + " and is now " + per2.getAge());
        System.out.println(per1.compareAge(per2));
    }
}
