import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;

public class DollarFormat {
    public static void main(String[] args) {
        DecimalFormat dollars = new DecimalFormat("0.00");

        String s = args[0];
        Double d = Double.valueOf(s);
        String formatted = dollars.format(d);
        String unformatted = formatted.toString();

        System.out.println(s);
        System.out.println(formatted);
        System.out.println(unformatted);
    }
}
