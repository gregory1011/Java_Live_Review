package week07_C;


import java.util.Arrays;

public class countries {
    public static void main(String[] args) {

        String [] countries = {"Cuba", "China", "Moldova", "Russia", "United States",
                     "France", "Colombia", "Honduras", "Indonesia", "Canada"};

        for (String country : countries) {  // country will be each element
            System.out.println(country.charAt(0) + " " +
                               country.charAt(country.length()- 1));

        }
        System.out.println("--------------------------------");

        String small = countries[0];
        String large = countries[0];

        for (String each : countries){

            if (each.length() < small.length()){
                small = each;
            }else if(each.length() > large.length()) {
                large = each;
            }

        }

        System.out.println(small);
        System.out.println(large);

        System.out.println("------------------------");

        String hasC = "";

        for( int i = 0; i < countries.length; i++){
            if (countries[i].startsWith("C")){
                hasC += countries[i] + " ";
            }
        }

        System.out.println(hasC);

        String [] hasC_Array = hasC.split(" ");
        System.out.println(Arrays.toString(hasC_Array));

        System.out.println("------------------------");

        String endsS = "";

        for( int i = 0; i < countries.length; i++){
            if (countries[i].endsWith("s")){
                endsS += countries[i] + " ";
            }
        }

        System.out.println(endsS);

        String [] endsS_Array = endsS.split(" ");
        System.out.println(Arrays.toString(endsS_Array));

        System.out.println("------------------------");

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));



    }
}
