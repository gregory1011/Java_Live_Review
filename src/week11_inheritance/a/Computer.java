package week11_inheritance.a;

public class Computer {
    public String os;
    protected int memory;
    String brand;
    private boolean hasWifi;

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifi=" + hasWifi +
                '}';
    }


}
