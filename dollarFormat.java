import java.text.NumberFormat;
import java.util.Locale;

public class DollarFormat {
    public static void main(String args[]) {
        NumberFormat dollars = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(dollars.format(args[1]));
    }
}
