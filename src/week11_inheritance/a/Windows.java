package week11_inheritance.a;

public class Windows extends Computer {
    public static void main(String[] args) {
        Windows obj = new Windows();
        System.out.println(obj.os);
        System.out.println(obj.memory);
        System.out.println(obj.brand);


        System.out.println();
        System.out.println(obj);

    }


}
