import java.util.Scanner;

public class Opgave2_3 {

    public static void main(String[] args) {

        // Udskriv til terminal "Enter meter"
        System.out.print("Enter meter: ");

        // Læs fra terminal Double
        Scanner input = new Scanner(System.in);
        double meter = input.nextDouble();

        // Sæt antal feet per meter
         double feet = meter * 3.2786;

        System.out.println(meter + "meters are " + feet + " feet ");
    }
}
