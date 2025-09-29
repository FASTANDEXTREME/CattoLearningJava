import java.util.Scanner;

public class NestedIfs {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double price=9.99;
        int age;

        boolean isStudent;
        boolean isSenior=false;

        System.out.printf("Base price of ticket is %.2f\n",price);
        System.out.print("Are you a student(true/false):");
        isStudent= scanner.nextBoolean();

        System.out.print("What is your age?:");
        age= scanner.nextInt();

        if(age>=65){
            isSenior= true;
        }

        if(isStudent) {
            if (isSenior) {
                System.out.println("You get an student discount of 10%");
                System.out.println("You get an senior discount of 20%");
                price = price - (price * 30 / 100);
            }
            else {
                System.out.println("You get an student discount of 10%");
                price = price - (price * 10 / 100);

            }
        }

        else {
            if(isSenior){
                System.out.println("You get an senior discount of 20%");
                price=price-(price*20/100);

            }

        }

        System.out.printf("Your final price is: %.2f",price);






    }
}
