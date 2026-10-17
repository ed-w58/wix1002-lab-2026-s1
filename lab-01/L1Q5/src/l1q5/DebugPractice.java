package l1q5;

public class DebugPractice {
    public static void main(String[] args) {
        int quantity = 3;
        double unitPrice = 2.50;
        double total = quantity * unitPrice; // Deliberate logic error
        System.out.printf(java.util.Locale.US, "Total: %.2f%n", total);
    }
}