import java.util.Scanner;

public class Opgave2_4 {

    public static void main(String[] args) {

        System.out.print("Enter a number i square meter ");

        Scanner input = new Scanner(System.in);
        double squaremeter = input.nextDouble();

        double ping = squaremeter * 0.3025;

        System.out.println(squaremeter + " Squaremeters are " + ping + " ping ");
    }
}
