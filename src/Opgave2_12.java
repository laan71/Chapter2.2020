import java.util.Scanner;

public class Opgave2_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and accelaration: ");
        double speed = input.nextDouble();
        double accelaration = input.nextDouble();

        double runwayLength = Math.pow(speed, 2) / (2 * accelaration);

        System.out.println("The minimum runway length for this airplane is " + runwayLength);
    }
}
