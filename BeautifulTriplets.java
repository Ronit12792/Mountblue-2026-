import java.util.HashSet;

public class BeautifulTriplets {

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,7,8,10};
        int d = 3;

        HashSet<Integer> set = new HashSet<>();

        // store all elements
        for(int num : arr) {
            set.add(num);
        }

        int count = 0;

        for(int num : arr) {

            if(set.contains(num + d) &&
               set.contains(num + 2*d)) {

                count++;
            }
        }

        System.out.println(count);
    }
}