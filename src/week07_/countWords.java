package week07_;

public class countWords {

    public static int countWords(String str){

        int spaces = 0;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)  == ' '){
                spaces++;
            }

        }

        return spaces + 1;
    }

    public static int countWords2(String str){

        int  words = 1;
        str = str.trim();

        while (str.contains(" ")  ){
            words++;
            str = str.replaceFirst(" ", "");  // delete the first space
         }

        return words;

    }

    public static void main(String[] args) {

        System.out.println(countWords( " hello world"));
        System.out.println(countWords( " Today is wednesday"));
        System.out.println(countWords( " hello everyone ok all"));
        System.out.println(countWords( " what a day lol alright"));

        System.out.println("=========");

        System.out.println(countWords2("hello world"));
        System.out.println(countWords2( " Today is wednesday"));
        System.out.println(countWords2( " hello everyone ok all"));
        System.out.println(countWords2( " what a day lol alright"));






    }

}
