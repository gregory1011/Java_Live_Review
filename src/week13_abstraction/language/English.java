package week13_abstraction.language;

public class English implements Language{

    @Override
    public void hello() {
        System.out.println("Greetings.");
    }

    @Override
    public void buy() {
        System.out.println("Good buy.");
    }



}
