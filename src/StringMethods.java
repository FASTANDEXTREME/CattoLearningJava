import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        String name;
        String password;
        System.out.print("Enter your name:");
        name = scanner.nextLine();
        System.out.print("Enter your password:");
        password = scanner.nextLine();


        /*int length =name.length();
        System.out.println(length);

        char letter = name.charAt(0);
        System.out.println(letter);

        int Index =name.indexOf("o");
        System.out.println(Index);

        int lastIndex =name.lastIndexOf("o");
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name); */

/*        if(name.isEmpty()){
            System.out.println("You did not enter any name");
        }
        else if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else {
            System.out.println("Your name does not have any space");
        }*/

        if(name.equals(password)){
            System.out.println("Your password cant be same as name.");

        }
        else{
            System.out.println("Hello catto");
        }


    }
}
