// Make a function to check if a number is prime or not.

package PracticePaper.exercise7;

import java.util.*;

public class Functions1 {
    public static void checkPrime(int n) {
        
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return;
        }

        boolean isPrime = true;
        for(int i=2 ; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int n = sc.nextInt();
        
        checkPrime(n);
    }
}
