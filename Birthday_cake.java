import java.util.*;

public class Birthday_cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // number of candles
        int n = sc.nextInt();

        ArrayList<Integer> candles = new ArrayList<>();

        // input values
        for (int i = 0; i < n; i++) {
            candles.add(sc.nextInt());
        }

        int max = Integer.MIN_VALUE;
        int count = 0;

        // logic
        for (int h : candles) {
            if (h > max) {
                max = h;
                count = 1;
            } else if (h == max) {
                count++;
            }
        }

        // output
        System.out.println(count);
    }
}