package Avengers;

public class C011_Only14 {

    /*

Given an array of ints, return true if every element is a 1 or a 4.


only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
     */

    public static void main(String[] args) {

    }

    public boolean only14(int[] nums) {

        boolean isValid = true; // elements are 1 or 4

        for (int each : nums) {

            if ( each != 1 && each != 4 ){
                isValid = false;
                break;
            }
        }


        return false;
    }
}
