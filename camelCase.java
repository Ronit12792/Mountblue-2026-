import java.util.*;

public class camelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();  // user input
        
        int count = camelcase(s);
        
        System.out.println(count);
        
        sc.close();
    }

    public static int camelcase(String s) {
        if (s == null || s.isEmpty()) return 0;

        int count = 1; // first word
        
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        
        return count;
    }
}