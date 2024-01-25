package week09_CONSTRUCTOR;

public class Hobby {

    String name;
    double annualCost;
    boolean isOutDoors;
    boolean requireOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutDoors, boolean requireOthers) {
        this ( name, annualCost );
        this.isOutDoors = isOutDoors;
        this.requireOthers = requireOthers;
    }

   public void doIt(){
       System.out.println(" Doing "+name + (isOutDoors ? " outside." : " inside.") );
   }

    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutDoors=" + isOutDoors +
                ", requireOthers=" + requireOthers +
                '}';
    }
}



