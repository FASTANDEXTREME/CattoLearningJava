import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String [] choices={"rock","paper","scissor"};

        String playerChoice;
        String computerChoice;
        String playAgain="yes";



        System.out.println("***********************");
        System.out.println("Rock, Paper, Scissor!!!");
        System.out.println("***********************");


        do{
            System.out.print("Enter your choice(rock,paper,scissor):");
            playerChoice= scanner.nextLine().toLowerCase();
            while (!playerChoice.equals("rock") && !playerChoice.equals("paper")&&!playerChoice.equals("scissor")){
                System.out.println("Invalid choice");
                System.out.print("Enter your choice(rock,paper,scissor):");
                playerChoice= scanner.nextLine().toLowerCase();
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.printf("Computer chooses %s.\n",computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("Its a tie.");
            }

            else if ( (playerChoice.equals("rock")&&computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper")&&computerChoice.equals("scissor")) ||
                    (playerChoice.equals("scissor")&&computerChoice.equals("rock")) ){
                System.out.println("You lose!!");
            }
            else {
                System.out.println("You win!!!");
            }
            System.out.print("Do you want to continue(yes/no):");
            playAgain =scanner.nextLine().toLowerCase();


        }
        while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!!");

        scanner.close();

    }
}
