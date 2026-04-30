import java.util.*;

public class Equalize_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        int n = sc.nextInt();

        // list input
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        // function call
        int result = equalizeArray(arr);
        System.out.println(result);
    }

    public static int equalizeArray(List<Integer> arr) {
        int[] freq = new int[101];

        // count frequency
        for (int num : arr) {
            freq[num]++;
        }

        // find max frequency
        int maxFreq = 0;
        for (int f : freq) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }

        // return deletions
        return arr.size() - maxFreq;
    }
}