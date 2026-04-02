import java.util.*;

public class PairSocks {

    public static int sockMerchant(int n, List<Integer> ar) {

        Collections.sort(ar); // sort list

        int totalPairs = 0;

        for (int i = 0; i < n - 1; i++) {
            if (ar.get(i).equals(ar.get(i + 1))) {
                totalPairs++;
                i++; // skip next (already paired)
            }
        }

        return totalPairs;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);
    }
}