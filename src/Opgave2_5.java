import java.util.Scanner;

public class Opgave2_5 {

    public static void main(String[] args) {

        System.out.print("Enter the subtotal and gratuity rate ");
        Scanner input = new Scanner(System.in);

        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $ " + gratuity + " and the total is $ " + total);

    }
}
