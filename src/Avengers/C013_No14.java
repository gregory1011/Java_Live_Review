package Avengers;

public class C013_No14 {


    /*
Given an array of ints, return true if it contains nr 1's, or it contains nr 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */

    public static void main(String[] args) {

    }

    public boolean no14(int[] nums) {

        int countOf1 = 0;
        int countOf4 = 0;
        boolean result = true;

        for (int each : nums) {

            if (each == 1)
                countOf1++;
            if (each == 4)
                countOf4++;

        }

        if ( countOf4 >= 1 && countOf1 >=1)  // if I have both result will be false
            result  = false;


        return result;


    }
}