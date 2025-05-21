// Write a program that calculates the Greatest Common Divisor of 2 numbers

import java.util.Scanner;

public class quest09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int original_n1 = n1;
        int original_n2 = n2;

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;  
            }
        }
        
        System.out.println("GCD of " + original_n1 + " and " + original_n2 + " is: " + n1);
        
        sc.close();  
    }
}
 