package week03_ifStmts_switch_ternary;

public class Finra {
    public static void main(String[] args) {

        int num = 8;

        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;

        if (by3 &&  by5){
            System.out.println("FINRA");
        }else if (by3){
            System.out.println("FIN");
        }else if ( by5){
            System.out.println("RA");
        }else {
            System.out.println(num);
        }

        // ternary example
        System.out.println(by3 && by5 ? "FINRA" : by3 ?"Fin" : by5 ? "RA" :num);
    }
}
