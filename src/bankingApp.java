import java.util.Scanner;

public class bankingApp {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws InterruptedException {
        double balance=0;
        int choice;
        boolean isRunning = true;

        while(isRunning){

            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> Balance(balance);
                case 2-> balance+=Deposit();
                case 3 -> balance -=Withdraw(balance);
                case 4 ->  isRunning= false;
                default -> System.out.println("Invalid choice!!!");
            }
        }

    }

    static void Balance(double bal) throws InterruptedException {
        System.out.printf("Your current balance is ₹ %.2f\n",bal);
        Thread.sleep(3000);
    }

    static double Deposit() throws InterruptedException {
        double amount;
        System.out.print("Enter amount to deposit:");
        amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("You cannot deposit negative money!!");
        }
        else{
            System.out.printf("You have deposited ₹%.2f amount\n", amount);
        }
        Thread.sleep(3500);
        return amount;


    }

    static double Withdraw(double bal) throws InterruptedException {
        System.out.print("How much you want to withdraw?:");
        double amount;
        double result=0;
        amount= scanner.nextDouble();
        if(amount>bal){
            System.out.println("You don't have enough money to withdraw!!");
        }
        else if(amount<0){
            System.out.println("What in this financial world means to withdraw negative money? ");
        }
        else{
            result= amount;
            System.out.printf("You withdrew ₹%.2f successfully", result);
        }
        Thread.sleep(3500);
        return result;

    }

}
