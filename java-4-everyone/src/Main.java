import sealed_interfaces_n_classes.sealed_interface.AirtelMoneyPayment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public int calculateAge(int yearOfBirth){
        if(yearOfBirth >=2026){
            throw new IllegalArgumentException("year of birth cant be " + yearOfBirth);
        }
        return 2026 - yearOfBirth;
    }

    public static void main(String[] args) {
        //System.out.println("hello frm main");
//        AirtelMoneyPayment airtel = new AirtelMoneyPayment();
//        System.out.println(airtel.process(100));

        LocalDateTime l = LocalDateTime.now();
        System.out.println("local date time: " + l);

        LocalDate d = LocalDate.now();
        System.out.println("local date: " + d);

        LocalTime t = LocalTime.now();
        System.out.println("local time: "+ t);
        System.out.println("local time sub-stringed: " + t.toString().substring(0,5) );
        System.out.println(t.toString().substring(4));

        Main m = new Main();
        System.out.println("age: " + m.calculateAge(2003));

    }
}
