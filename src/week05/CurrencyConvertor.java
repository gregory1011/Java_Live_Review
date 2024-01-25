package week05;

public class CurrencyConvertor {
    public static void main(String[] args) {

       double convert = convertFromDollar("won", 100);
        System.out.println(convert);


        System.out.println(convertFromDollar("euro", 100));



    }

    public static double convertFromDollar(String currency, double dollars){


        double result = dollars;

        switch ( currency.toLowerCase().trim() ){

            case "euro":
                result = dollars * 0.91;
                        break;
            case "yen":
                result = dollars * 121.03;
            case "lira":
                result = dollars * 14.85;
                break;
            case "won":
                result = dollars * 1_217.52;
                break;
            case "rupee":
                result = dollars * 181.45;
                break;

        }
        return result;
    }


}
