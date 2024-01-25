package week02;

public class Overtime {
    public static void main(String[] args) {

        double hourlyRate = 50.0;
        int hoursWorked = 40;
        double netPay;
        String message;

        if(hoursWorked>40) { // condition if the hours worked are more then 40
            int overtimeHours = hoursWorked -40;
            netPay = hourlyRate * 40 ;   // normal pay form 40 h
            netPay += hourlyRate * 1.5 * overtimeHours;   // for overtime you get paid 1.5 times your rate
            message = "Wow you worked " + hourlyRate+ " so you will get "+ overtimeHours+
                    " hours of overtime. Your net pay is: $" +netPay;

        }else{ // worked less then 40 h
            netPay= hourlyRate * hoursWorked  ; // your normal pay from 40 h
            message = "you worked "+ hoursWorked+" hours, so your total net pay is: $"+netPay;
        }

        System.out.println(message);


    }


}
 /*
 Overtime [if else, operators, variables]

	Declare and assign the following variables
		hourly rate & number of hours worked

	Calculate your total net pay for the week. Also consider if any overtime should be paid. Overtime will be 1.5 times the normal rate and should be paid for every hour over 40.
	(if you worked 43 hours total, you will get 40 hours normal pay and 3 hours overtime pay)

	Output different messages based on overtime
		if normal hours were worked (40 hours or less):
			You worked $hours hours, so your total net pay is: $netPay

		if you worked overtime (more than 40 hours):
			Wow you worked $hours hours so you will get $overtime_hours of overtime. Your net pay is $netPay

  */