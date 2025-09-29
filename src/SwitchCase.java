import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);


        String day;
        System.out.print("Which day you have in mind?: ");
        day = scanner.nextLine();

        switch(day){

            //DEFAULT WAY
          /*  case "Monday" -> System.out.println("Its a weekday");
            case "Tuesday" -> System.out.println("Its a weekday");
            case "Wednesday" -> System.out.println("Its a weekday");
            case "Thursday" -> System.out.println("Its a weekday");
            case "Friday" -> System.out.println("Its a weekday");
            case "Saturday" -> System.out.println("Its a weekend");
            case "Sunday" -> System.out.println("Its a weekend");
            default -> System.out.printf("%s is not a day", day);*/

            //BETTER WAY

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"-> System.out.println("Its a weekday ;(");
            case "Saturday","Sunday"->System.out.println("Its a weekend :)");
            default -> System.out.printf("%s is not a day", day);


        }
    }
}
