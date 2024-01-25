package week08;

import java.util.Arrays;

public class averageEach {
    public static void main(String[] args) {

        int [][] nums = {
                {3,4,5,6},
                {5,2,6},
                {10,40,20},
        };

        System.out.println(Arrays.toString(nums));

        double sumOfAll = 0;
        int totalNumberOfElements = 0;

        for (int[] eachArr : nums) {

            double sumEach = 0;  //  this should reset each time the outer loop runs

            for (int eachNumber : eachArr) {
                sumEach += eachNumber;
            }

            double average = sumEach / eachArr.length;    // average = sum of number / amount of numbers

            System.out.println("average of "+ Arrays.toString(eachArr)+ " is "+ average);

            sumOfAll += sumEach;   // adding the sum of each inner array to the total sum

            totalNumberOfElements += eachArr.length;

        }

        System.out.println("Total average "+ (sumOfAll / totalNumberOfElements));



    }
}
