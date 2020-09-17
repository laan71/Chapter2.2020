import java.util.Scanner;

public class Opgave2_6b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int initialNumber = input.nextInt();

        int number = initialNumber;
        int multiplication = initialNumber % 10;

        if (initialNumber > 1000 || initialNumber < 0) {
            System.out.println("Out of range!");
            System.out.println("Number should be between 0 & 1000!");
        } else {
            while (number / 10 != 0) {
                number = number / 10;
                multiplication *= number % 10;
            }

            System.out.println("Multiplication of the digits in the number "
                    + initialNumber + " equals to " + multiplication);
        }
    }
}
