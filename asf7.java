import java.util.Scanner;

public class asf7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if ((number&number-1)==0) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
        
        scanner.close();
    }

    public static boolean isPowerOfTwo(int n) {
        // Check if n is greater than 0 and (n & (n - 1)) is 0
        return n > 0 && (n & (n - 1)) == 0;
    }
}