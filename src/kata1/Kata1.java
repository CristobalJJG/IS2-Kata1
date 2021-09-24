package kata1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Kata1 {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("01/03/2000", format);
        
        Person person = new Person("Nano", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
    
}
