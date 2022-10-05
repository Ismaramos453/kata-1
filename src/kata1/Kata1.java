
package kata1;

import java.util.Date;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.Period;


public class Kata1 {

   
    public static void main(String[] args) {
        LocalDate date;
        date= LocalDate.of(2001, 11, 13);
        
        Person persona = new Person("Ismael",date );
        System.out.println(persona.getName() + " tiene " + persona.getAge());
    }
    
}
