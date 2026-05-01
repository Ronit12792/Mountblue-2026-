import java.util.*;

public class love_mystery {

    public static int theLoveLetterMystery(String s) {
        int operations = 0;
        
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            
            operations += Math.abs(left - right);
            
            i++;
            j--;
        }
        
        return operations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();   // number of test cases
        sc.nextLine();          // consume newline
        
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(theLoveLetterMystery(s));
        }
        
        sc.close();
    }
}