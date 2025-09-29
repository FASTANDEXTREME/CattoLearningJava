public class usingprintf {
    public static void main(String[] args) {

        // %[flags][width][precision][specifier char]

        String name= "HARSH";
        int age= 19;
        double height = 173.522;
        boolean isStudent =true;

        System.out.printf("My name is %s\n",name);
        System.out.printf("My age is %d\n",age);
        System.out.printf("My height is %.1f\n",height);
        System.out.printf("Student: %b\n",isStudent);

    }
}
