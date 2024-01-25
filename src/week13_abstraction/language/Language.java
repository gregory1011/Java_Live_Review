package week13_abstraction.language;

public interface Language {

    String defaultCoding = "UTF- 8";


    void hello();

    void buy();

      static void translate(){
         System.out.println("Language have the ability to thoughts and ideas" +
            " to others using units of sound like words or sentences.");
}

default  void translate (Language lang, String msg ){
    System.out.println("Translating " +  msg + " in "
            + getClass().getSimpleName() + " into " + lang.getClass().getSimpleName());
}

}
