package week04;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Java Hotel");
        System.out.println("How many days you will stay?");
        int numOfDays = keyboard.nextInt();

        System.out.println("How many people are in your party?");
        int numOfPeople = keyboard.nextInt();
        keyboard.close();

        double price = 0 ;
        String roomType = "";
        boolean isValid = true;


        switch (numOfPeople){
            case 1:
                roomType = "Single room";
                price  = numOfDays * 100;
                break;

            case 2:
                roomType = "Double room";
                price  = numOfDays * 125;
                break;

            case 3:
            case 4:
                roomType = "Large room";
                price  = numOfDays * 50;
                break;

            case 5:
            case 6:
                roomType = "Suite room";
                price  = numOfDays * 1000;
                break;

            default:
                System.out.println("Sorry "+ numOfPeople+" is not a valid group size");

                isValid = false;

        }
        if (isValid) {
            System.out.println("You are assigned to a " + roomType +
                    " for days " + numOfDays + " so your total comes to " + price);

        }

    }

}
