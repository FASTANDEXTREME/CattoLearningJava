import java.sql.SQLOutput;
import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        double weight;
        double newWeight;

        System.out.println("!!WEIGHT CONVERTER!!");
        System.out.println("1:LBS TO KGS\n2:KGS TO LBS");
        System.out.print("Enter your choice:");
        choice= scanner.nextInt();

        if(choice==1) {
            System.out.print("Enter the weight:");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("%.3f LBs is %.3f KGs.", weight, newWeight);
        }
        else if(choice==2) {
            System.out.print("Enter the weight:");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("%.3f KGs is %.3f LBs.", weight, newWeight);
        }
        else{
            System.out.println("No valid choice Entered.");
        }










    }
}
