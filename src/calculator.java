import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result=0;
        char op;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st Number:");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operation (+,-,*,/):");
        op = scanner.next().charAt(0);

        System.out.print("Enter the 2nd Number:");
        num2= scanner.nextDouble();

        switch(op){
            case '+'-> result = num1+num2;
            case '-'-> result = num1-num2;
            case '*'-> result = num1*num2;
            case '/'-> result = num1/num2;
            default -> System.out.println("Invalid operation");
        }

        System.out.println(result);
        scanner.close();
    }
}
