import java.util.*;

public class BigSorting{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of elements
        List<String> arr = new ArrayList<>();

        // input
        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }

        // sorting using compareTo logic
        Collections.sort(arr, (a, b) -> {

            // Step 1: length compare
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }

            // Step 2: same length → compareTo
            return a.compareTo(b);
        });

        // output
        for (String s : arr) {
            System.out.println(s);
        }
    }
}