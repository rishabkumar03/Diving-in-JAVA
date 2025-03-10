// Print all even numbers till n.

package PracticePaper.level4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");

        int n = sc.nextInt();
        System.out.println("Even numbers upto " + n + " are: ");

        for(int i=2; i<=n; i+=2) {
        System.out.println(i);
        }
    }
}
