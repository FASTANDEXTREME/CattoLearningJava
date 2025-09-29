import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int age =0;
        System.out.print("What is your age:");
        age= scanner.nextInt();

        while(age<0)
        {
            System.out.println("This is not an valid age!!");
            System.out.print("What is your age:");
            age= scanner.nextInt();}

        System.out.printf("you are %d yes old",age);

    }
}
