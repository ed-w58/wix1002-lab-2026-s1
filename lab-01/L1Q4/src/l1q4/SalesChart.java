package l1q4;

public class SalesChart {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        int[] amounts = {2500, 1600, 2000, 2700, 3200, 800};
        System.out.println("Product A sales, 2016");
        System.out.println("Scale: one * represents 100 units");
        for (int i = 0; i < amounts.length; i++) {
            String bar = "*".repeat(amounts[i] / 100);
            System.out.printf("%-3s %-32s %4d%n", months[i], bar, amounts[i]);
        }
    }
}