package week13_abstraction.language;

public class Spanish implements Language{

    @Override
    public void hello() {
        System.out.println("Hola");
    }

    @Override
    public void buy() {
        System.out.println("Adios");
    }




}
