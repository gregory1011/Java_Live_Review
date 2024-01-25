package week06_Loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String add = "";
        String list = "";
        int attempts = 3;

        do{
            System.out.println("- What item do you want to add to the list?");
             //     String item = input.nextLine();
             //    list += item;

            list += "\n\t* "+input.nextLine();

            System.out.println("- Do you want to add more items?");
            add = input.nextLine();

            // this loop is for invalid responses, allows for trying to ask
            while (attempts > 0 &&(! add.equalsIgnoreCase("yes") && ! add.equalsIgnoreCase("no"))){
                System.out.println("Sorry did you want to add more items? Yes/No");
                add = input.nextLine();
                attempts--;
            }


        }while(add.equalsIgnoreCase("yes"));

        System.out.println("Shipping list:");
        System.out.println(list);

    }
}
