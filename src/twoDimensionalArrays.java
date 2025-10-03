import java.util.Arrays;

public class twoDimensionalArrays{
    public static void main(String[] args) {

        String []fruits ={"apple","banana","pineapple"};
        String []meat={"Chicken","Mutton","Fish"};
        String []vegetables={"Potato","Cucumber","Onion"};

        String [][]groceries = {fruits,meat,vegetables};

        for(String [] foods:groceries){
            for(String food:foods){
                System.out.print(food +" ");
            }
            System.out.println();

        }
    }


}
