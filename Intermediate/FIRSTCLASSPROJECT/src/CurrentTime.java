import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static void main (String[] args){
        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));
    }
}

