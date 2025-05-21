// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class quest02 {
    public static void printSumOfOdds(int n) {

        int Sum = 0;

        for(int i=1; i<=n; i++){
            if (i % 2 != 0) {
                Sum = Sum + i;
            } else {

            }
        }
        
        System.out.println(Sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from which you want sum of all odd numbers : ");
        int n = sc.nextInt();

        printSumOfOdds(n);
    }
}
