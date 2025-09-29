import java.util.Scanner;



public class forLoop {
    // simulating countdown
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int count;
        int i;
        System.out.print("From where to begin the countdown from?:");
        count = scanner.nextInt();

        for(i=count; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy new year!!");

        //BREAK = STOPS THE LOOP
        //CONTINUE = SKIPS THE PART OF LOOP

    }
}
