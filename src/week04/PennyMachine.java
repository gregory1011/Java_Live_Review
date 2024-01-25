package week04;

import java.util.Scanner;

public class PennyMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter your cents");
        int cents = input.nextInt();
        if ( cents > 0 && cents <= 1200) {


            int dollars, quarters, nickles, dimes;
            String msg = cents + " was converted to ";

            dollars = cents / 100;
            cents %= 100;
            msg += dollars>0 ? dollars +" dollars, " : "";

            quarters = cents / 25;
            cents %= 25;
            msg += quarters >0 ? quarters +" quarters, " : "";

            dimes = cents / 10;
            cents %= 10;
            msg += dimes >0 ? dimes  +" dimes, " : "";

            nickles = cents / 5;
            cents %= 5;
            msg += nickles >0 ? nickles  +" nickles, " : "";

            msg += cents >0 ?cents + " pennies, " : "";


            input.close();
            System.out.println(msg);

        }else {
            System.out.println("sorry we cannot process your request.");
        }

    }
}
/*   original example :


  Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter your cents");
        int cents = input.nextInt();
        if ( cents > 0 && cents <= 1200) {


            int dollars, quarters, nickles, dimes;
            String msg = cents + " was converted to ";

            dollars = cents / 100;
            cents %= 100;
            quarters = cents / 25;
            cents %= 25;
            dimes = cents / 10;
            cents %= 10;
            nickles = cents / 5;
            cents %= 5;

            msg += dollars + " dollars " + quarters + " quarters " + dimes +
                    " dimes " + nickles + " nickles " + cents + " pennies";

            input.close();
            System.out.println(msg);

        }else {
            System.out.println("sorry we cannot process your request.");
 */