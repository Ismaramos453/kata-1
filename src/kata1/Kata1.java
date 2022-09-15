
package kata1;

import java.util.Date;

public class Kata1 {

   
    public static void main(String[] args) {
        Person person = new Person("Ismael", new Date(102,2,13));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
