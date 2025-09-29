import java.util.Scanner;


public class overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3;
        String dec, op;

        System.out.println("Calculator using overloading!!\nOnly use int or double, do not use both at same time");
        System.out.print("Enter the first number:");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the operation(add/multiply):");
        op = scanner.nextLine();
        System.out.println("Is there a third number?(yes/no):");
        dec = scanner.nextLine().toUpperCase();

        if (dec.equals("YES")) {
            System.out.print("Enter the third number(if any):");
            num3 = scanner.nextInt();
            switch (op) {
                case "add" -> System.out.printf("Result is %.2f", add(num1, num2, num3));
                case "multiply" -> System.out.printf("Result is %.2f", multiply(num1, num2, num3));
            }

        }
        else{
            switch (op) {
                case "add" -> System.out.printf("Result is %.2f", add(num1,num2));
                case "multiply" -> System.out.printf("Result is %.2f", multiply(num1, num2));
            }

        }


    }

    static double add(double x, double y) {
        return x + y;
    }

    static double add(double x, double y, double z) {
        return x + y + z;
    }

    static double multiply(double x, double y) {
        return x * y;
    }

    static double multiply(double x, double y, double z) {
        return x*y*z;
    }

}