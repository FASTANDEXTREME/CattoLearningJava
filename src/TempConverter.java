import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        //CONVERTING TEMPERATURE USING TERNARY OPERATOR

        double temp;
        double newtemp;
        String unit;

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the temperature:");
        temp = scanner.nextDouble();
        // GETTING STRING AFTER NUMBER CREATES ERROR, use scanner.nextLine()
        scanner.nextLine();
        System.out.print("Convert into C or F?:");
        unit = scanner.nextLine().toUpperCase();
        newtemp = (unit.equals("F"))? (temp * 9/5) + 32 : (temp - 32) * 5/9;
        System.out.printf("%.3f %s",newtemp,unit);




    }
}
