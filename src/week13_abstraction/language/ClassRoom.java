package week13_abstraction.language;

public class ClassRoom {

    public static void main(String[] args) {

        English english = new English();
        english.hello();
        english.buy();
        System.out.println(english.defaultCoding);

        System.out.println("-----------------------------------------------");

        Spanish spanish = new Spanish();
        spanish.hello();
        spanish.buy();
        System.out.println(english.defaultCoding);

        System.out.println("-----------------------------------------------");

        Language.translate();

        english.translate(spanish, "Hello how are you");







    }
}
