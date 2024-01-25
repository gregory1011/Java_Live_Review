package week13_abstraction;

public final class Running extends Exercise {

    @Override
    public void perform() {
        System.out.println("Running fast");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 15;
    }
}
