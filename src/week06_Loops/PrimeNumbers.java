package week06_Loops;

public class PrimeNumbers {
    public static void main(String[] args) {

        int range = 50;

        for (int j = 2; j <= range; j++) {

            int num = 11;
            boolean isPrime = true;

            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime){
                System.out.print(j+", ");
            }
        }

    }

    public static boolean isPrime(int n) {


        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static String primeInRange(int range){

        String prime = "";
        for (int i = 0; i < range; i++) {

            if(isPrime(i) ){
                prime+= i + ", ";
            }

        }

        return prime.substring(0, prime.length()-2);
    }
}
