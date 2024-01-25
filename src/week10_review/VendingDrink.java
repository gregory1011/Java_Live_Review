package week10_review;

import java.util.ArrayList;

public class VendingDrink {

    ArrayList<Drink> allDrinks;

    public VendingDrink (){
        allDrinks = new ArrayList<>();
    }

    public VendingDrink(ArrayList<Drink> inputDrinks){
        this();
        allDrinks.addAll(inputDrinks);
    }

    public void stock ( ArrayList<Drink> newDrinks){
        for (Drink each : newDrinks){

            for (Drink vending : allDrinks) {

                if (vending.name.equalsIgnoreCase(each.name)){
                    vending.quantity += each.quantity;
                    break;
                }

                allDrinks.add(each);

            }
        }

    }




    public String toString (){
        String output = "";
        for ( Drink each : allDrinks ){
            output += each + "\n";
        }

        return output;

    }




}
