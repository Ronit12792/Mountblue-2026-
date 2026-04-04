import java.util.Scanner;

public class bill_division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("total no. of item");
        int n = sc.nextInt();

        System.out.println("enter the price of item");
        int[] price = new int[n];
        int totalPrice = 0;

        for(int i = 0; i < price.length; i++){
            price[i] = sc.nextInt();
            totalPrice += price[i];
        }

        System.out.println("enter the index anna dont eat the item");
        int item = sc.nextInt();

        // ✅ safety check
        if(item < 0 || item >= n){
            System.out.println("Invalid index");
            return;
        }

        int actualPay = (totalPrice - price[item]) / 2;

        System.out.println("enter total amount brian charged from anna");
        int brianChrg = sc.nextInt();

        if (brianChrg == actualPay) {
            System.out.println("Bon Appetit");  // ✔ fixed
        } else {
            System.out.println("Brian extra charge from Anna: " + (brianChrg - actualPay));
        }

        sc.close();
    }
}