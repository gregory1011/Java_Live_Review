package week04;

import java.util.Scanner;

public class String_ModifyWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //  String Word = "java";  // hard coded

        String word = input.next();
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);  // last index : str(length()-1

        String middle = word.substring(1, word.length()- 1);

        if ( first == last){  // we use == because we are comparing char types
            System.out.println ( word.substring ( 1, word.length()- 1) );
        } else {
            System.out.println("*"+middle+ "#");
        }

        /*
               word = everyone;
               charAt(0) -> e
               word.charAt(word.length() -1) ;


         */
    }
}
