package secondstotime;

import java.util.Scanner;

public class SecondsToTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        long totalSeconds = scanner.nextLong();
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds%n",
                totalSeconds, hours, minutes, seconds);
    }
}