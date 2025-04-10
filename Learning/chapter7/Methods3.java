/*
 
MAIN FUNCTION

The main function is a special function as the computer starts running the code from the beginning of the main. Main function serves as the entry point for the program.

 */

// Find the factorial of a number

package chapter7;

import java.util.*;

public class Methods3 {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }

        // loop
        int factorial = 1;

        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();

        printFactorial(n);
    }
}
