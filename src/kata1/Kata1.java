package kata1;

import java.util.Date;

public class Kata1 {
    public static void main(String[] args) {
        Person person = new Person("Nano", new Date(00, 3,1));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
    
}
