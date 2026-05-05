import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class datetimecode {
    public static void main (String [] args) {
        LocalDateTime n1 = LocalDateTime.now();
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy  HH : mm : ss a");
        String var = n1.format(f1);
        System.out.println("current date and time: " + var);
    }
}