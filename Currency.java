import java.util.*;
import java.text.*;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Locale for India (manually defined)
        Locale indiaLocale = new Locale("en", "IN");

        // Currency formatters
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Format each payment
        String usFormatted = us.format(payment);
        String indiaFormatted = india.format(payment);
        String chinaFormatted = china.format(payment);
        String franceFormatted = france.format(payment);


        // Print formatted results
        System.out.println("US: " + usFormatted);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
    }
}
