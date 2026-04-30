public class min_dist {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 4, 1, 7};

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // सही loop
                if (arr[i] == arr[j]) {
                    int dist = j - i;

                    if (dist < min) {
                        min = dist;
                    }
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}