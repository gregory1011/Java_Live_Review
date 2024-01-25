package week06_Loops;

public class Count_Hi {

    public static int countHi(String str){
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countHi("hielloworldhihihihiorld"));
    }

}
