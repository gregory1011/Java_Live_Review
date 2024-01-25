package week04;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word");
        String word = input.next();   // input.next().toLowerCase();
        input.close();

        word = word.toLowerCase();
        int middleIndex = word.length() / 2;
        String firstPart, lastPart, middlePart;


        if(word.length() % 2 == 0){  // java -> 4/2 = 2
            // even length - 2 middle characters

            firstPart = word.substring(0, middleIndex -1);
            middlePart = word.substring(middleIndex -1, middleIndex +1);
            middlePart = middlePart.toUpperCase();
            lastPart = word.substring(middleIndex +1);


        }else{
            // odd length - 1 middle characters
             firstPart = word.substring(0, middleIndex);
             middlePart = "" + word.charAt(middleIndex);
            // word.substring (middleIndex, middleIndex + 1);

            middlePart = middlePart.toUpperCase();
             lastPart = word.substring(middleIndex + 1);

        }


        System.out.println(firstPart+middlePart+lastPart);

        // abcde  -> c
    }
}
