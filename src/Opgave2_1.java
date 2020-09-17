import java.util.Scanner;

public class Opgave2_1 {

    public static void main(String[] args) {

        // Udskriv til terminal "Enter mile"
        System.out.print("Enter miles: ");

        // læs fra terminal double
        Scanner input = new Scanner(System.in);
        double mile = input.nextDouble();

        // Sæt antal km pr mile
        double km = 1.6;

        // Udskriv til terminal "x mile er lig y km"
        System.out.println(mile + " miles is " + mile * km + " kilometers");
    }

}



