import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int numOfFruits;

        String [] fruits = {"Apple","Banana", "Orange","Coconut"};
        numOfFruits = fruits.length;
        Arrays.sort(fruits);

        Arrays.fill(fruits,"Pineapple"); // fill full array with pineapple


        // arrays are collection of data of similar datatypes;;
        System.out.println(fruits[0]); //to print out a single array

        // default loop
        for(int i=0; i<numOfFruits;i++){
         System.out.println(fruits[i]);
        }

        // enhanced loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
