import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextDouble()) {
            double miles = sc.nextDouble();
            
            double km = miles * 1.60934;
            double m = km * 1000;
            double cm = m * 100;

            BigDecimal bdKm = BigDecimal.valueOf(km).setScale(5, RoundingMode.DOWN);

            System.out.println("Kilometers: " + bdKm);
            System.out.println("Meters: " + m);
            System.out.println("Centimeters: " + cm);
        }
        
        sc.close();
    }
}
