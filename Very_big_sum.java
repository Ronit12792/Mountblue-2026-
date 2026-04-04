import java.util.*;

public class Very_big_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Long> sum=new ArrayList<>();

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            sum.add(sc.nextLong());
        }
        long result=0;
        for(long num:sum){
           result+=num;
        }
        System.out.println(result);
    }
}
