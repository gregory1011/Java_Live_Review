package week13_abstraction.building;

public abstract class Building {

    String location;
    double price;

    public abstract void pay();

    public Building(String location, double price) {
        this.location = location;
        this.price = price;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "location='" + location + '\'' +
                ", price= $" + price +
                '}';
    }



}
