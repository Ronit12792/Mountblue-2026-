import java.util.*;
public class sumArray {
    public static int Arraysum(List<Integer> ar){
        int sum=0;
        for(int num: ar){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(sc.nextInt());
        }
        int result=Arraysum(ar);
        System.out.println(result);

    }
}
