import java.util.*;

public class BreakingRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            return Arrays.asList(0, 0);
        }
        int minScore = scores.get(0);
        int maxScore = scores.get(0);
        int minBreaks = 0;
        int maxBreaks = 0;
        int index = 1;

        while (index < scores.size()) {
            int currentPoint = scores.get(index);
            if (currentPoint > maxScore) {
                maxScore = currentPoint;
                maxBreaks++;
            }
            if (currentPoint < minScore) {
                minScore = currentPoint;
                minBreaks++;
            }
            index++;
        }

        return Arrays.asList(maxBreaks, minBreaks);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of scores (optional, can also be ignored)
        int n = scanner.nextInt();
        List<Integer> scores = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            scores.add(scanner.nextInt());
        }
        
        List<Integer> result = breakingRecords(scores);
        System.out.println(result.get(0) + " " + result.get(1));
        
        scanner.close();
    }
}