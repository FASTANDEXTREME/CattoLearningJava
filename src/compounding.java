import java.util.Scanner;

public class compounding {
    public static void main(String[] args) {
        double principal;
        double rate;
        int n;
        double amount;
        double time;

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the Principal amount:");
        principal=scanner.nextDouble();

        System.out.print("Enter the annual interest rate(in %):");
        rate= scanner.nextDouble()/100;

        System.out.print("Enter the amount of times its compounded per year:");
        n= scanner.nextInt();

        System.out.print("Enter amount of year its invested for:");
        time= scanner.nextDouble();

        amount = principal*Math.pow(1+(rate/n), n*time);

        scanner.close();

        System.out.printf("Amount after %.1f year is %.1f",time, amount);







    }
}
