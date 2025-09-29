import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        String Item;
        double Price;
        int Quantity;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item you would like to buy?");
        Item = scanner.nextLine();
        System.out.print("What is price of each of the Item?");
        Price = scanner.nextDouble();
        System.out.println("What is the quantity of item(s)?:");
        Quantity = scanner.nextInt();

        System.out.println("You have brought "+ Quantity + " "+Item+"(s)");
        System.out.println("Your total bill is "+ Quantity*Price +"$");



    }

}
