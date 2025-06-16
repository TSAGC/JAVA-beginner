import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintDateTime {
    public static void main(String[] args) {
        printDateTime();
    }


    public static void printDateTime() {

        LocalDateTime Time = LocalDateTime.now();

        System.out.println(Time);
    }


    public static void printOrderedDate() {
        LocalDateTime Time = LocalDateTime.now();
        String formatedDate = Time.format(DateTimeFormatter.ISO_LOCAL_DATE);


    }
}
