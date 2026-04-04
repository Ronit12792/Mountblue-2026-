import java.util.*;
public class subArrayDiv {
public static int birthday(List<Integer> list,int m,int d){
    int count=0;
    for(int i=0;i<=list.size()-m;i++){
        int sum=0;
        for(int j=i;j<i+m;j++){
            sum+=list.get(j);
        }
        if (sum==d) {
            count++;
            
        }
    }
return count;
}
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of square in chocolate bar");
       int n=sc.nextInt();
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<n;i++){
        list.add(sc.nextInt());
       } 
       System.out.println("Enter rons month which is value of m");
       int m=sc.nextInt();
       System.out.println("enter rons birtday which is value of d");
       int d=sc.nextInt();
      int result= birthday(list, m, d);
System.out.println("the number of way she can divide the chocolate "+result);
    }
}
