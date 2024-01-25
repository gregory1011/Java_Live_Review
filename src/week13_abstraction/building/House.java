package week13_abstraction.building;

public class House extends Building implements HasBackyard{

    int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("Paying mortgage");
    }

    @Override
    public void mowLawn() {
        System.out.println("Mowing the backyard");
    }

    @Override
    public String toString() {
       return "location='" + location + '\'' +
                ", number of residents " + numberOfResidents +'\'' +
                ", price= $" + price +
                '}';
    }
}
