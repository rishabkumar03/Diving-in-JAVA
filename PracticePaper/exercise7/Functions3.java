// Make a function to print the table of a given number n.

package PracticePaper.exercise7;

import java.util.*;

public class Functions3 {
    public static void printTable(int n) {

        for(int i=1; i<=10; i++){
            int table = n * i;
            System.out.println(table);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print it's table : ");
        int n = sc.nextInt();

        printTable(n);
    }
}
