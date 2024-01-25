package week04;

import java.util.Scanner;

public class String_Name {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your first and last name");
        String name = input.nextLine();   // James Bond
        name = name.toLowerCase();

        int spaceIndex = name.indexOf(" ");  // index number of "space" is: 5
        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1);

      //  String upperFirst = name.substring(0,1).toUpperCase();  //   "" + name.charAt(0)

        firstName = firstName.substring(0,1 ).toUpperCase() + firstName.substring(1);

        String lastNameChar = lastName.substring(0,1);
        lastNameChar = lastNameChar.toUpperCase();
        lastName = lastNameChar + lastName.substring(1);


        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstName.substring(0,1) + lastName.substring(0,1));

    }

}
