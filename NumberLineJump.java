import java.util.Scanner;

public class NumberLineJump {
    
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // If speeds are equal
        if (v1 == v2) {
            return (x1 == x2) ? "YES" : "NO";
        }
        
        // Check if difference in positions is divisible by difference in speeds
        // AND the result is positive (same direction)
        if ((x1 - x2) % (v2 - v1) == 0 && (x1 - x2) / (v2 - v1) > 0) {
            return "YES";
        }
        
        return "NO";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter position and jump speed for Kangaroo 1:");
        System.out.print("x1 (starting position): ");
        int x1 = scanner.nextInt();
        System.out.print("v1 (jump distance): ");
        int v1 = scanner.nextInt();
        
        System.out.println("\nEnter position and jump speed for Kangaroo 2:");
        System.out.print("x2 (starting position): ");
        int x2 = scanner.nextInt();
        System.out.print("v2 (jump distance): ");
        int v2 = scanner.nextInt();
        
        // Calculate result
        String result = kangaroo(x1, v1, x2, v2);
        
        // Display result
        System.out.println("\nResult: " + result);
        
        scanner.close();
    }
}