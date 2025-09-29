public class methods {
    public static void main(String[] args) {

        happyBirthday("Harsh",21);
        double result= square(3.0);
        System.out.println(result);

       String name = getFullName("Harsh","Bhoite");
        System.out.println(name);

        checkage(22);

    }

    static void happyBirthday(String lolol, int age){
        System.out.print("HAPPY BIRTHDAY TO YOU\n");
        System.out.printf("HAPPY BIRTHDAY TO %s\n",lolol);
        System.out.printf("You are now %d years old\n", age);
    } //using void because nothing to return

    static Double square(Double number){

        return number*number;
    }


    static String getFullName(String firstName, String lastName){
        return firstName+ " " + lastName;
    }

    static void checkage(int age){
        if(age>18){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You are not eligible");
        }

    }
}