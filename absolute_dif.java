import java.util.*;

public class absolute_dif{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Sort array
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        // Step 2: Find minimum absolute difference
        for (int i = 1; i < n; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        // Output result
        System.out.println(minDiff);
    }
}