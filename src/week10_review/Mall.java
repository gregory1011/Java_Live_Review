package week10_review;

import java.util.ArrayList;
import java.util.Arrays;

public class Mall {

        public static void main(String[] args) {

            // This is an ArrayList of Drink objects
            ArrayList<Drink> soda = new ArrayList<>(Arrays.asList(
                    new Drink("Coke", 1.99, 20),
                    new Drink("Pepsi", 1.89, 10),
                    new Drink("7UP", 1.55, 25),
                    new Drink("Fanta", 1.25, 10),
                    new Drink("Mountain Dew", 2.49, 5),
                    new Drink("Water Bottle", 4.99, 10)
            ));

            // Another ArrayList of Drink objects
            ArrayList<Drink> juice = new ArrayList<>(Arrays.asList(
                    new Drink("Orange Juice", 2.39, 10),
                    new Drink("Apple Juice", 2.39, 9),
                    new Drink("Pomegranate Juice", 3.55, 10),
                    new Drink("Cranberry Juice", 3.21, 10),
                    new Drink("Lemonade", 3.59, 17),
                    new Drink("V8", 1.99, 10)
            ));

            VendingDrink vendingOne = new VendingDrink();
            vendingOne.allDrinks.add(new Drink("Redbull", 2.99, 10));

            vendingOne.allDrinks.addAll(soda);
            System.out.println(vendingOne.allDrinks);
            System.out.println(vendingOne);

            System.out.println("---------------------------------------------");

            VendingDrink vendingTwo  = new VendingDrink(juice);

            System.out.println(vendingTwo);


            System.out.println("---------------------------------------------");



            ArrayList<Drink> newDrinks = new ArrayList<>(Arrays.asList(
                  new Drink("Orange Juice", 2.39,  5),
                    new Drink("pomegranate Jice", 3.55, 15)
            ));






        }

}
