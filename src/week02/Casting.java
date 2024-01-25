package week02;

public class Casting {
    public static void main(String[] args) {

        int i = 30;
        long l = i;

        long l2 = 100;   // 100 is int , int is smoller then long,
        //   so no problem , it will automatically go to long for the variable
        byte b2 = (byte )l2;
        System.out.println(b2);

        double d3 = 15.99;
        int i3 = (int)d3;
        System.out.println(i3);

        int i4 = 1_000_000;
        byte b4 =(byte )i4;      // the byte cannot hold this number there is a loss
        System.out.println(b4);  // the results are based on some calculation

        // float f5 = 10.23;    // trying to store double into a float type
        float f5 = 10.23F;
        int i5 =  (int)f5;
        System.out.println((double)i5);

        char letter ='A';
        System.out.println((int)letter);

        double d6= 12.99;
        long l6 = (long)d6;   // 12






    }
}
