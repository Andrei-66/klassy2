import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.time.format.DateTimeFormatter;

public class Formats {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("\nЧисло "+nf.format(123456789));

        NumberFormat cf=NumberFormat.getCurrencyInstance();
        System.out.println("\n Валюта "+cf.format(1234.50f));


    }}
