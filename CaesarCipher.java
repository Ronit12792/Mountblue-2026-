import java.util.Scanner;

public class CaesarCipher{

    public static String caesarCipher(String s, int k) {
        k = k % 26;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)((ch - 'a' + k) % 26 + 'a');
            }
            // uppercase
            else if (ch >= 'A' && ch <= 'Z') {
                ch = (char)((ch - 'A' + k) % 26 + 'A');
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter shift (k): ");
        int k = sc.nextInt();

        String result = caesarCipher(s, k);

        System.out.println("Output: " + result);
    }
}