/*
 
FUNCTION_NAME

It is the unique name of that function.
It is always recommended to declare a function before it is used.

 */

// Make a function to add two numbers and return the sum

package chapter7;

import java.util.Scanner;

public class Methods1 {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = calculateSum(a, b);
        System.out.println("Sum of two numbers is: " + result);
    }
}
