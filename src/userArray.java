//INTEGER KE BAAD STRING use nextline


import java.util.Scanner;

public class userArray {
    public static void main(String[] args) {
        int items;

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many food items you want?:");
        items = scanner.nextInt();
        scanner.nextLine();


        String [] foods = new String[items];

        for(int i=0;i<foods.length;i++){
            System.out.print("Enter the food:");
            foods[i] = scanner.nextLine();

        }

        for(String food : foods){
            System.out.println(food);
        }


    }
}
