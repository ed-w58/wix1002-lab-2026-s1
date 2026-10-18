package carloanpayment;
import java.util.Locale;
import java.util.Scanner;

public class CarLoanPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Car Price: ");
        double P = scanner.nextInt();
        System.out.print("Down Payment: ");
        double D = scanner.nextInt();
        System.out.print("Annual Rate: ");
        double R = scanner.nextInt();
        System.out.print("Duration: ");
        double Y = scanner.nextInt();
        double M = (P - D) * (1 + R * Y / 100) / (Y * 12);
        System.out.printf(Locale.US, "Monthly Payment: RM%.2f%n", M);
    }
}
