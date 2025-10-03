public class varagrs {
    public static void main(String[] args) {

        System.out.println(average(1,2,3,4));


    }

    static double average(double ... numbers){
        double total=0;
        if(numbers.length==0){
            return 0;
        }

        for (double number:numbers){
            total +=number;
        }
        return total/numbers.length;
    }
}
