
package kata1;

import java.util.Date;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.Period;


public class Kata1 {

   
    public static void main(String[] args) {
        LocalDate date;
        date= LocalDate.of(2001, 11, 13);
        
        Person person = new Person("Ismael",date );
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
