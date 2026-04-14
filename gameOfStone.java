import java.util.*;

public class gameOfStone {

    public static String gameOfStones(int n) {

        boolean[] dp = new boolean[n + 1];

        // base cases
        dp[0] = false;
        if (n >= 1) dp[1] = false;

        for (int i = 2; i <= n; i++) {

            boolean win = false;

            if (i >= 2 && !dp[i - 2]) win = true;
            if (i >= 3 && !dp[i - 3]) win = true;
            if (i >= 5 && !dp[i - 5]) win = true;

            dp[i] = win;
        }

        return dp[n] ? "First" : "Second";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(gameOfStones(n));
        }

        sc.close();
    }
}