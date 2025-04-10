// Make a program that prints the table of a number that is input by the user without the concept of loops. 

package PracticePaper.exercise2;

import java.util.*;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Enter the number of which you want table");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = n*1;
        int t2 = n*2;
        int t3 = n*3;
        int t4 = n*4;
        int t5 = n*5;
        int t6 = n*6;
        int t7 = n*7;
        int t8 = n*8;
        int t9 = n*9;
        int t10 = n*10;

        System.out.println(n + " * 1 = " + t1);
        System.out.println(n + " * 2 = " + t2);
        System.out.println(n + " * 3 = " + t3);
        System.out.println(n + " * 4 = " + t4);
        System.out.println(n + " * 5 = " + t5);
        System.out.println(n + " * 6 = " + t6);
        System.out.println(n + " * 7 = " + t7);
        System.out.println(n + " * 8 = " + t8);
        System.out.println(n + " * 9 = " + t9);
        System.out.println(n + " * 10 = " + t10);
    }
}
