import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class quizarrays {
    public static void main(String[] args) {
        int guess;
        int correct=0;

        Scanner scanner = new Scanner(System.in);
        //java program to answer quiz
        //array of questions
        //array of choices

        String[] questions = {"What is main function of a router?",
                "What part of computer is considered as its brain?",
                "What year facebook was launched?",
                "What was the first programming language?"};

        String[][] options = {{"1.Connect multiple networks", "2.Make sandwich", "3.Set alarm",},
                {"1.Face", "2.Leg", "3.CPU"},
                {"1.2007", "2.2004", "3.2006"},
                {"1.Java", "2.Python", "3.FORTRAN"}};

        int [] answers ={1,3,2,3};

        System.out.println("**********************");
        System.out.println("JAVA QUIZ USING ARRAYS");
        System.out.println("**********************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String option: options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess:");
            guess=scanner.nextInt();

            if (guess== answers[i]){
                System.out.println("*******");
                System.out.println("Correct");
                System.out.println("*******");
                correct++;

            }
            else{
                System.out.println("*********");
                System.out.println("Incorrect");
                System.out.println("*********");

            }

        }
        System.out.printf("Your score is %d / %d", correct,questions.length);
    }
}


