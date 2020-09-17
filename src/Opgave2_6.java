import java.util.Scanner;

public class Opgave2_6 {

    public static void main(String[] args) {

        System.out.print("Enter a number between 0 and 1000 ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int digit3 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit1 = (number / 100);
        int multiplication = digit1 * digit2 * digit3;


        System.out.println("The multiplication of all digits in " + number + " is " + multiplication);
        System.out.println("Digit 1 is " + digit1 + ", digit 2 is " + digit2 + " and digit 3 is " + digit3);
    }
}
