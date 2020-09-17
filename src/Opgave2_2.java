
import java.util.Scanner;

public class Opgave2_2 {

    public static void main(String[] args) {

        System.out.println("Enter length of the sides and height of the Equilateral triangle: ");
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();

        double y = 2;
        double area = Math.sqrt(3)/4*Math.pow(side, y);
        System.out.println("The area is " + area);

        double volume = area * 5;
        System.out.println("The volume of the triangular prism is " + volume);
    }
}
