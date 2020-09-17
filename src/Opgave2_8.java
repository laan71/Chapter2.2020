import java.util.Scanner;

public class Opgave2_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the timezone offset to GTM: ");
        int timezoneOffset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + timezoneOffset) % 24;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
