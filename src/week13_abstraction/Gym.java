package week13_abstraction;

public class Gym {

    public static void main(String[] args) {

       Running running = new Running();
       running.perform();
        System.out.println(running.getCaloriesBurned(60));

        Bench bench = new Bench();
        bench.perform();
        bench.rockWeight();
        System.out.println(bench.getCaloriesBurned(100));



    }




}
