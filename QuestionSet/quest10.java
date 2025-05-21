// Write a program to print Fibonacci Series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ...... 
// In the Fibonacci Series, a number is the sum of the previous 2 numbers that came before it.


import java.util.Scanner;

public class quest10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        int a = 0, b = 1;
        
        System.out.print(a);
        
        if (n > 1) {
            for(int i=2; i<=n; i++) {
                System.out.print(" " + b);
                int temp = b;
                b = a + b;
                a = temp;
            }
        }
        
        System.out.println();
        sc.close();
    }
}
