import java.util.Scanner;

public class ArRec {
    public static void main(String[] args) {
        double lenght;
        double breadth;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Lenght of Rectangle: ");
        lenght = scanner.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        breadth= scanner.nextDouble();
        area = lenght*breadth;
        System.out.print("Area of rectangle is "+area);



    }
}
