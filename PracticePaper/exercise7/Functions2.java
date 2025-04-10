// Make a function to check if a given number n is even or not.

package PracticePaper.exercise7;

import java.util.*;

public class Functions2 {
    public static void isEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is even or not: ");
        int n = sc.nextInt();
        isEven(n);
    }
}
