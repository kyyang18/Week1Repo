import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = input.nextInt();

        // Calculations
        int maxHeartRate = 220 - age;
        // Calculating percentages for range and casting as integers
        int minHeartRateRange = (int) (50 * maxHeartRate / 100);
        int maxHeartRateRange = (int) (85 * maxHeartRate / 100);

        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR zone is " + minHeartRateRange + " - " + maxHeartRateRange + " beats per " +
                "minute");

    }
}
