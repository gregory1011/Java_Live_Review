package week05;

public class Runner {

    public static void main(String[] args) {

        // Method converting from dollars
      double result = CurrencyConvertor.convertFromDollar
              ("euro", 100);
        System.out.println(result);

        System.out.println("-------------------");

        // method multiplication table
        MultiplicationTable.multiplicationTable(5);

        // method multiplication table 2
        MultiplicationTable.multiplicationTable(2, 10);


    }


}
