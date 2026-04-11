import java.util.*;

public class towerBreak {

    public static int towerBreakers(int n, int m) {
        if (m == 1) {
            return 2;
        } else if (n % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // number of towers
            int m = sc.nextInt(); // height of towers

            System.out.println(towerBreakers(n, m));
        }

        sc.close();
    }
}