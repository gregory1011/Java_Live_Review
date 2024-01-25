package week06_Loops;

public class Item {
    String name;
    int quantity;
    double unitPrice;


    public void setInfo (String name, int quantity, double unitPrice){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

   public void sellItem (int number){
        if(quantity>=number){
            System.out.println(number+" "+name + " for: $" + (unitPrice * number));
            quantity-=number;
        }else{
            System.out.println("Sorry we only have: " + quantity);
        }
   }

   public String toString(){
        String result = "Item: " + name + " | " + quantity+ " | $"+  unitPrice;
       return result;
   }

}
