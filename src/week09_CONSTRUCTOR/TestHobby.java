package week09_CONSTRUCTOR;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHobby {

    public static void main(String[] args) {


        Hobby golf = new Hobby("Golf", 1000, true, false);
        Hobby puzzle = new Hobby("Puzzle", 200, false, true);
        Hobby soccer = new Hobby("Soccer", 800, true, true);
        Hobby chess = new Hobby("Chess", 200, false, true);
        Hobby tennis = new Hobby("Tennis", 1300, true, true);
        Hobby java = new Hobby("Java");


        ArrayList<Hobby> hobbies = new ArrayList<>();
        hobbies.addAll(Arrays.asList(golf, puzzle,soccer,chess,tennis,java));

        hobbies.addAll(Arrays.asList(
                new Hobby("Ping pong", 200, false, true),
                new Hobby("Boxing", 2000, false, true),
                new Hobby("Racing", 4500)

        ));

        hobbies.add(new Hobby("Painting"));
        hobbies.set(0, soccer);

        System.out.println(hobbies);

        System.out.println("---------------------------------------");

        for (Hobby each : hobbies) {
            each.doIt();
        }
        System.out.println();

        System.out.println("---------------------------------------");

        ArrayList<Hobby> outdoors = new ArrayList<>(hobbies);
        ArrayList<Hobby> requireOthers = new ArrayList<>(hobbies);
        ArrayList<Hobby> highCost = new ArrayList<>(hobbies);

        outdoors.removeIf(p ->  !p.isOutDoors);
        requireOthers.removeIf( p -> p.requireOthers);
        highCost.removeIf(p -> p.annualCost > 500);

        System.out.println(outdoors);
        System.out.println(requireOthers);
        System.out.println(highCost);






    }

}
