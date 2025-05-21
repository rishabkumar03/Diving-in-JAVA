// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class quest03 {
    public static void isGreater(int a, int b) {

        if ( a > b){
            System.out.println(a + " is greater");
        } else if ( a < b){
            System.out.println(b + " is greater");
        } else {
            System.out.println("Both the numbers are equal");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find which one is greater");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        isGreater(a, b);
    }
}
