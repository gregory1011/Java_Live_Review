package week13_abstraction;

public class Bench extends Lifting{


    @Override
    public void perform() {
        System.out.println("Bench Pressing");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 5;
    }

    @Override
    public void rockWeight() {
        System.out.println("Racking weights");
    }
}
