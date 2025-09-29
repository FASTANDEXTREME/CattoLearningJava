import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        String fiSa;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.print("Are you a student: ");
        boolean isStudent = scanner.nextBoolean();

        if (isStudent) {
            fiSa = "You are a student";
        } else {
            fiSa = "You are not a student";
        }

        System.out.println("Your name is " + name + ". " +
                "Your age is " + age +
                " and your CGPA is " + cgpa + ". " + fiSa);

        scanner.close();
    }
}