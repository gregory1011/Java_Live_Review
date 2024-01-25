package week06_Loops;

public class Palindrome {

    public static boolean isPalindrome(String str){

        for (int begin = 0,  end = str.length()-1; begin < str.length() / 2; begin++, end--) {
         if( str.charAt(begin) != str.charAt(end) ){
             return false;
            }
        }
return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("anna"));

    }

}
