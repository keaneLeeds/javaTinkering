import java.text.SimpleDateFormat;
import java.util.DateFormat;
import java.util.Calendar;

public class dateTinker {
    public dateTinker() {}

    public static void main(String[] args) {
	String date = "012014";
	SimpleDateFormat sdf = new SimpleDateFormat("MMYYYY");
	Calendar cal = Calendar().getInstance();
 
	String time = sdf.format(cal.getTime());
    }

}