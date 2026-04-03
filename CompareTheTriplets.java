import java.util.*;

public class CompareTheTriplets {
    
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }
        
        return Arrays.asList(aliceScore, bobScore);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for Alice's triplets
        System.out.println("Enter Alice's 3 scores (separated by spaces):");
        List<Integer> alice = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            alice.add(scanner.nextInt());
        }
        
        // Input for Bob's triplets
        System.out.println("Enter Bob's 3 scores (separated by spaces):");
        List<Integer> bob = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            bob.add(scanner.nextInt());
        }
        
        // Compare and get result
        List<Integer> result = compareTriplets(alice, bob);
        
        // Display result
        System.out.println("\nResult:");
        System.out.println("Alice's score: " + result.get(0));
        System.out.println("Bob's score: " + result.get(1));
        System.out.println("Final scores: [" + result.get(0) + ", " + result.get(1) + "]");
        
        scanner.close();
    }
}