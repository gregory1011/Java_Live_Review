package week05;

public class MultiplicationTable {

        public static void multiplicationTable ( int number){

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

        }


      //   Method MultiplicationTable2

    public static void multiplicationTable (int number, int limit){
        for (int i = 1; i <= limit; i++) {
            System.out.println( number+ " x " + i +" = " + (number * i));
        }
    }



}
