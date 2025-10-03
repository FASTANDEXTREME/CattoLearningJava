import java.util.Scanner;

public class searchingArray {
    public static void main(String[] args) {
        String target;

        Scanner scanner = new Scanner(System.in);

//        int [] numbers ={1,2,3,8,6,4,7};

        String [] fruits ={"apple","banana","pineapple"};
        boolean isFound = false;

        System.out.print("Which fruit to find?:");
        target = scanner.nextLine();

        for(int i=0; i<fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.printf("Element found at index %d",i);
                isFound = true;
                break;
            }

        }

        if(!isFound){
            System.out.println("No Such element found!");
        }
    }
}
