

public class variables{
    public static void main(String[] args) {
        //Primitive variables = value directly stored into memory
        int age=21; //declaration of int
        double money = 22.5;
        char grade = 'A';
        System.out.println(grade);
        System.out.println(age);
        System.out.println(money);
        System.out.println("My age is "+ age + " and i have "+money+" rupees and my grade is "+ grade);

        boolean isStudent = true;
        boolean forSale = false;
        System.out.println(forSale); // used within the code, not really for output
        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("you are not a student");
        }

        // Reference variables
        String name= "Harsh";
        System.out.println("hello "+ name);
    }
}
