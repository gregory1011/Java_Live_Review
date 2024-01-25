package week07_;

import java.util.Scanner;

public class colorPicker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int colors = 1;  // we will have 3 colors red, green, orange
        String selected = "Here are the colors you picked: ";

        while(colors <= 3){
            System.out.println("Enter a color "+ colors);
            String currentColor = input.nextLine().toLowerCase().trim();

            if (! selected.contains(currentColor+ ", ") ){
                selected += currentColor + ", ";
                colors++;
                System.out.println(currentColor + " added");
            }else{
                System.out.println(currentColor + " is already selected, please try again");
            }
        }

        System.out.println( selected.substring(0, selected.length() - 2) );

    }
}
