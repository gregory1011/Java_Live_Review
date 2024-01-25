package week09_CONSTRUCTOR;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Holidays {

        public static ArrayList<LocalDate> getHolidays(){

            ArrayList<LocalDate> holidays = new ArrayList<>(Arrays.asList(
                    LocalDate.of(2023, 1,1 ),
                    LocalDate.of(2023, 1,16 ),
                    LocalDate.of(2023, 2,20 ),
                    LocalDate.of(2023, 4,9 ),
                    LocalDate.of(2023, 4,16 ),
                    LocalDate.of(2023, 5,29 ),
                    LocalDate.of(2023, 6,19 ),
                    LocalDate.of(2023, 7,4 ),
                    LocalDate.of(2023, 9,4 ),
                    LocalDate.of(2023, 10,9 ),
                    LocalDate.of(2023, 11,10 ),
                    LocalDate.of(2023, 11,23 ),
                    LocalDate.of(2023, 12,25 )


            ));

            return holidays;


        }


    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
        System.out.println("What month do you want to chck the dates for? (num)");

        int inputMonth = input.nextInt();

        DateTimeFormatter FOR =  DateTimeFormatter.ofPattern("MMM/d/y");

        for ( LocalDate eachDate : getHolidays()) {

            if ( inputMonth  == eachDate.getMonthValue()){
                System.out.println(eachDate.format(FOR));
            }
        }



    }





}
