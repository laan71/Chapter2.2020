import java.util.Scanner;

public class Opgave2_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double births = years * 365.0 * 24 * 60 * 60 / 7;
        double deaths = years * 365.0 * 24 * 60 * 60 / 13;
        double immigrants = years * 365.0 * 24 * 60 * 60 / 45;
        double population = 312032486 + births - deaths + immigrants;

        System.out.println("The population in " + years + " years is " + (int) population);
    }
}
