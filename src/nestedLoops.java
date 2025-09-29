import java.util.Scanner;



public class nestedLoops {
    public static void main(String[] args) {
        int i;
        int row;
        int j;
        int column;
        int num=0;
//        Character c;

        Scanner scanner =new Scanner(System.in);

        System.out.println("MATRIX MAKER");
        System.out.print("Enter the number of rows:");
        row = scanner.nextInt();
        System.out.print("Enter the number of columns:");
        column = scanner.nextInt();
//        System.out.print("Enter the character you want in it:");
//        c = scanner.next().charAt(0);


        for(j=0 ;j<row;j++){
            for(i=0;i<column;i++){
                num++;
                System.out.printf("%d",num);
            }
            System.out.println();
        }

        }





    }
