import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);



        int marks;
        System.out.print("Enter your marks:");
        marks= scanner.nextInt();

       String PassOrFail= (marks>55)? "PASS":"FAIL";
        System.out.printf("You are %s.",PassOrFail);
        scanner.close();

    }
}
