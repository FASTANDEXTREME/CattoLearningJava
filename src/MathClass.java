import java.util.Scanner;


public class MathClass {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        double a;
        double b;
        double result;
//        result = Math.pow(2,3);
//        result = Math.abs(-3);
//        result= Math.round(Math.PI);
//        result = Math.floor(Math.PI);
//        result = Math.ceil(Math.PI);

        //HYPOTENUSE OF RIGHT TRIANGLE
//        System.out.print("Enter one side of triangle:");
//        a = scanner.nextInt();
//        System.out.print("Enter 2nd side of triangle:");
//        b= scanner.nextInt();
//        result =  Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//
//
//
//        System.out.println("Hypotenous of triangle is " +result+".");



        double rad;
        double cir;
        double area;
        double vol;

        System.out.print("Enter radius of a sphere:");
        rad = scanner.nextDouble();
        cir = 2*Math.PI*rad;
        area = Math.PI*Math.pow(rad,2);
        vol = (4.0/3.0) * Math.PI* Math.pow(rad,3);

        System.out.printf("The circumference of sphere is %.1fcm\n" , cir);
        System.out.printf("The area of sphere is %.1f cm^2\n ",area);
        System.out.printf("The volume of sphere is %.1f cm^3\n",vol);


        scanner.close();
    }
}
