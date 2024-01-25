package week02;

import java.sql.SQLOutput;

public class MyName {
    public static void main(String[] args) {

        System.out.println(5+3);
        System.out.println(5+3+"Hello");
//// example : create a chr variable for every character in your name,
// think about all the ways you can print your name

        System.out.println("=================");
        char first = 'G', second = 'r',third = 'i', fourth ='g';
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
        System.out.println();
        System.out.println(first+second+third+fourth);    // 393
        /// adds the numbers from the characters ascii table
        System.out.println("My name is "+ first+second+third+fourth);
        System.out.println(""+ first+second+third+fourth);




    }
}
