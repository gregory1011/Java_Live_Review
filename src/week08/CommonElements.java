package week08;

public class CommonElements {
    public static void main(String[] args) {

        int [][] arr = {
                {4,1,24,5},
                {24,1,5,2},
                {4,1,5,1}
        };

        for (int i = 0; i < arr[0].length; i++) {
            //  System.out.println(arr[0][i]);

            int isCommon = 0;

            for (int j = 0; j < arr.length; j++) {
               // System.out.println(Arrays.toString(arr[j]));


                for (int each : arr[j]) {
                    if (each == arr[0][i]){
                      isCommon++;
                      break;
                    }
                }

            }

            if (isCommon == arr.length){
                System.out.println(arr[0][i]);
            }

        }


    }

}
