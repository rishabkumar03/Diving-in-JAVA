/*

PARAMETERS

A function can take some parameters as inputs. These parameters are specified along with their data types. 
For eg - if we are waiting a function to add 2 integers, the parameters would be passed like - 
int add (int num1, int num2)

 */

// Make a function to multiply two numbers and return the product

package chapter7;

import java.util.*;

public class Methods2 {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        
        System.out.println("Product of two numbers is : " + calculateProduct(a, b));
    }
}
