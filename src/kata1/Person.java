
package kata1;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String nombre;
    private final LocalDate birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    
    public Person(String nombre, LocalDate birthdate){
        this.nombre = nombre;
        this.birthdate = birthdate;
    }
    public String getName(){
        return nombre;
    }
    public LocalDate getBirthdate(){
        return birthdate;
    }
    
    public int getAge(){
   
        return (int) (Period.between(birthdate,LocalDate.now()).getYears());
    }
    private long milliSecondsToYear(long milles) {
        return milles / MILLISECONDS_PER_YEAR;
    }
    
    
        
        

}
