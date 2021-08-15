import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();

        // Variables to keep track of how many percentage points are left
        int totalPointsRemaining = 100;

        // Generate the points for each breed
        int stBernardPoints = rng.nextInt(totalPointsRemaining) + 1;
        totalPointsRemaining -= stBernardPoints; // Reduce the amount of points remaining
        int chihuahuaPoints = rng.nextInt(totalPointsRemaining) + 1;
        totalPointsRemaining -= chihuahuaPoints;
        int asianPugPoints = rng.nextInt(totalPointsRemaining) + 1;
        totalPointsRemaining -= asianPugPoints;
        int curPoints = rng.nextInt(totalPointsRemaining) + 1;
        totalPointsRemaining -= curPoints;
        // Doberman is the last breed - it is simply the remaining points
        int dobermanPoints = totalPointsRemaining;


        System.out.println("What is your dog's name?");
        String dogName = input.next();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background" +
                " right here.");
        System.out.println("");
        System.out.println(dogName + " is:");
        System.out.println("");
        System.out.println(stBernardPoints + "% St. Bernard");
        System.out.println(chihuahuaPoints + "% Chihuahua");
        System.out.println(asianPugPoints  + "% Dramatic RedNosed Asian Pug");
        System.out.println(curPoints + "% Common Cur");
        System.out.println(dobermanPoints + "% King Doberman");
        System.out.println("");
        System.out.println("" );
        System.out.println("Wow, that's QUITE the dog!");

    }
}
