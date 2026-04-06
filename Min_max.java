public class Min_max {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        int count=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        long sum=0;
        
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }if (arr[i]<min) {
                min=arr[i];
            }
            sum+=arr[i];

            }
            long maximum=sum-min;
           long minimum=sum-max;
            System.out.println(sum);
            System.out.println("max= "+(maximum)+" "+"min= "+(minimum));

            

        }
      
    }

