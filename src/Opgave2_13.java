import java.util.Scanner;

public class Opgave2_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double saving = input.nextDouble();

        double month1 = saving * (1 + 0.003125);
        double month2 = (month1 + saving) * (1 + 0.003125);
        double month3 = (month2 + saving) * (1 + 0.003125);
        double month4 = (month3 + saving) * (1 + 0.003125);
        double month5 = (month4 + saving) * (1 + 0.003125);
        double month6 = (month5 + saving) * (1 + 0.003125);

        System.out.println("After the first month, the account value is: " + month1);
        System.out.println("After the second month, the account value is: " + month2);
        System.out.println("After the third month, the account value is: " + month3);
        System.out.println("After the sixth month, the account value is: " + month6);


    }
}
