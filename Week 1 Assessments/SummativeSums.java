public class SummativeSums {

    // Helper method that returns the sum of all the elements of the input array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        // Test arrays with sample values
        int[] testArray1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] testArray2 = { 999, -60, -77, 14, 160, 301 };
        int[] testArray3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190,
                200, -99 };

        System.out.println("#1 Array Sum: " + calculateSum(testArray1));
        System.out.println("#2 Array Sum: " + calculateSum(testArray2));
        System.out.println("#3 Array Sum: " + calculateSum(testArray3));
    }
}
