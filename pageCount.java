import java.util.*;

public class pageCount {
    public static int pageCount(int n, int p) {
        // flips from front
        int front = p / 2;

        // flips from back
        int back = (n / 2) - (p / 2);

        // return minimum
        return Math.min(front, back);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // total pages
        int n = sc.nextInt();

        // target page
        int p = sc.nextInt();

        int result = pageCount(n, p);
        System.out.println(result);

        sc.close();
    }
}