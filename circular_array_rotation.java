import java.util.*;

public class circular_array_rotation {

    // Function (HackerRank style)
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int n = a.size();
        List<Integer> result = new ArrayList<>();

        k = k % n;

        for (int q : queries) {
            int index = (q - k + n) % n;
            result.add(a.get(index));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        List<Integer> a = new ArrayList<>();

        // array input
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        List<Integer> queries = new ArrayList<>();

        // queries input
        for (int i = 0; i < q; i++) {
            queries.add(sc.nextInt());
        }

        List<Integer> result = circularArrayRotation(a, k, queries);

        // output
        for (int val : result) {
            System.out.println(val);
        }
    }
}