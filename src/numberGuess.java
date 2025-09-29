import java.util.Random;
import java.util.Scanner;


public class numberGuess {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        int number;
        int guess;
        int origin;
        int bound;
        int attempt=0;

        System.out.println("WELCOME TO NUMBER GUESSER!");
        System.out.print("You will be guessing the number within range you shall decide.\nFrom where the number should start?:");
        origin= scanner.nextInt();
        System.out.print("Till where you can guess?:");
        bound= scanner.nextInt()+1;

        number = random.nextInt(origin,bound);


        System.out.println("An random number has been selected, What is your first guess?:");
        guess= scanner.nextInt();

        do {
            attempt++;
            if(guess>number){
            System.out.print("You are incorrect. Number is smaller. Guess again:");
                guess= scanner.nextInt();
            }
            else if(guess<number){
                System.out.print("You are incorrect. Number is larger. Guess again:");
                guess= scanner.nextInt();
            }

        } while(guess!=number);
        System.out.printf("You guessed it right, the number was %d. You made it in %d attempt",number,attempt);






    }}



