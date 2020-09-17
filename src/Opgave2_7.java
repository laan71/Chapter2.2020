import java.util.Scanner;

public class Opgave2_7 {

    public static void main(String[] args) {

        System.out.print("Enter the number of minutes: ");
        Scanner input = new Scanner(System.in);

        int minutes = input.nextInt();
        double years = minutes / 60.0 / 24 / 365;
        double days = minutes / 60.0 / 24 % 365;

        System.out.println(minutes + " minutes is approximately " + (int)years + " years and " + (int)days + " days");
    }
}
