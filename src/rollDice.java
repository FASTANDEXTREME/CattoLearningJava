import java.util.Random;
import java.util.Scanner;


public class rollDice {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int noDice;
        int num;
        int total=0;

        System.out.println("*********");
        System.out.println("DICE GAME");
        System.out.println("*********");
        System.out.print("Enter the number of dice(s) you want:");
        noDice = scanner.nextInt();

        for(int i=0;i<noDice;i++){
            num  = random.nextInt(1,7);
            total = total + num;
            System.out.printf("Dice %d is %d\n",i,num);
            dices(num);
        }
        System.out.printf("The sum is %d", total);
        scanner.close();


    }

    static void dices(int roll){
        String dice1 = """
                 --------
                |        |
                |    ●   |
                |        |
                 --------
                """;

        String dice2 = """
                 --------
                | ●      |
                |        |
                |      ● |
                 --------
                """;

        String dice3= """
                 --------
                | ●      |
                |        |
                | ●     ●|
                 --------
                """;
        String dice4= """
                 --------
                | ●     ●|
                |        |
                | ●     ●|
                 --------
                """;
        String dice5= """
                 --------
                | ●     ●|
                |    ●   |
                | ●     ●|
                 --------
                """;
        String dice6= """
                 --------
                | ●     ●|
                | ●     ●|
                | ●     ●|
                 --------
                """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
    }


    }


}
