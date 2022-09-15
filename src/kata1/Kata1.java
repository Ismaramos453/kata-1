
package kata1;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Kata1 {

   
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2001, 11, 13);
        
        Person person = new Person("Ismael",date );
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
