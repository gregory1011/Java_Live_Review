package week06_Loops;

public class NestedExemple {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i+ " "+j);
            }
            System.out.println("Inner loop ended");
        }

    }
}
