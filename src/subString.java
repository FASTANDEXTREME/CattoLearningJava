import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String username;
        String domain;
        String email;

        System.out.print("Enter Your Email:");
        email = scanner.nextLine();

        if(email.contains("@")){
            username =email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);
            System.out.printf("Your username is %s\n",username);
            System.out.printf("Your domain is %s\n",domain);

        }
        else{
            System.out.println("Your email is not valid");
        }
        scanner.close();

    }
}
