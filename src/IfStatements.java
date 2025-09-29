import java.util.Scanner;


public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("What is your name? ");
        name = scanner.nextLine();

        //GROUP 1
        if(name.isEmpty()){
            System.out.print("Your did not entered a name");
        }
        else{
            System.out.println("Hello "+name+"!");
        }
        //

        System.out.print("What is your age: ");
        age = scanner.nextInt();

        //GROUP 2
        if(age<=0){
            System.out.println("You are not even born yet");
        }
        else if(age<18){
            System.out.println("You are an child.");
        }
        else if(age>18){
            System.out.println("You are an Adult.");
        }
        // END OF G2

        System.out.print("Are you a student?(true/false):");
        isStudent= scanner.nextBoolean();

        if(isStudent){
            System.out.println("You are a student.");
        }
        else {
            System.out.println("You are not an student.");
        }


    }
}
