package Avengers;

public class C008_Sum28 {


    /*

Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
     */

    public static void main(String[] args) {

    }

    public boolean sum28(int[] nums) {

        int countOF2 = 0;
        for ( int num : nums ){
            if ( num ==2 )
                countOF2++;
        }

        return countOF2 ==4 ;
    }
}
