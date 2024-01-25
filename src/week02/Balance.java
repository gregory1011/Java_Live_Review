package week02;

public class Balance {
    public static void main(String[] args) {


        double balance = 1000,
                withdrawAmount = 5000;
     //   balance = balance - withdrawAmount;  // another way
        balance -=withdrawAmount;   // same as line 9

        if (balance < 0){ // less then zero applies a fee 20 %
            System.out.println("Withdrew more than you have in the account. Overdraft applied");
           balance += (balance * 0.2);  //there is a overdraft and a fee applies: 20 % fee = 0.2
        }
        System.out.println("Total balance after: "+ balance);



    }


}
/*

Balance [single if, operators, variables]

	Declare and assign the following variables
		amount balance & withdraw amount

    Check the balance after the withdrawal
        if you withdrew more money that you had in the account add a overdraft fee of 20 % to the balance by subtracting 100

    In both cases print the remaining balance after withdrawing

 */