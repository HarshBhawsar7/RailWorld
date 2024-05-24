package Day11.Date;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        LocalDate ld= LocalDate.now();
        LocalTime lt=LocalTime.now();
        LocalDateTime ldt=LocalDateTime.now();
//      DateTime  Formating
//        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
//        String formattedDateTime= ldt.format(dtf);
//
//        System.out.println(ld);
//        System.out.println(lt);
//        System.out.println(ldt);
//        System.out.println("Before Formatting :"+ldt);
//        System.out.println("After Formatting "+formattedDateTime);

//
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);//yyyy-mm-dd
        LocalDate localDate1=LocalDate.from(ZonedDateTime.now());
        System.out.println(localDate1);
        LocalDate localDate2=LocalDate.of(1999,04,13);
        System.out.println(localDate2);
        String s="2000-12-12";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate3=LocalDate.parse(s);
        String s1=localDate3.format(dateTimeFormatter);
        System.out.println(s1);
        LocalDate yesterday = localDate.minusDays(1);
        LocalDate tommorow=localDate.plusDays(1);
        System.out.println(yesterday+" "+tommorow);


        String string="1995-05-17";
        LocalDate localDate4=LocalDate.parse(string);
        String string1=localDate4.format(dateTimeFormatter);
        System.out.println(string1);
    }
}
