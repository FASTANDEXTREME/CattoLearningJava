import java.util.Scanner;


public class logicalOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username;

        //username must be between 4-12 char
        //username must not contain spaces or underscores
        // && and, || or, ! not

        System.out.print("What you would like as a username:");
        username= scanner.nextLine();

        if(username.length()<=4 || username.length()>=12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ")|| username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.printf("Welcome %s",username);
        }






    }


}

