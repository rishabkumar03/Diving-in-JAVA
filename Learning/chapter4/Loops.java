/*

LOOPS

A loop is used for executing a block of statements repeatedly until a particular condition is satisfied. 
A loop consists of an initialization statement, a test condition and an increment statement.

FOR LOOP

The syntax of the for loop is :
for (initialization; condition; update) { 
 // body of-loop 
}

WHILE LOOP

The syntax for while loop is :
while(condition) { 
 // body of the loop 
}

DO-WHILE LOOP

The syntax for the do-while loop is :
do { 
 // body of loop; 
} 
while (condition);

 */

package chapter4;

import java.util.*;

public class Loops {
    public static void main(String args[]) {
        // FOR LOOP
        // counter++ => counter = counter + 1
        // for(int counter = 0; counter < 11; counter++) {
        //     System.out.print(counter+" ");
        // }

        // for(int i = 0; i < 11; i++) {
        //     System.out.println(i);
        // }

        // WHILE LOOP
        // int i = 0;
        // while(i < 11) {
        //     System.out.println(i);
        //     i = i + 1; // i++;
        // }

        // DO WHILE LOOP
        // int i = 0;
        // do { 
        //     System.out.println(i);
        //     i = i + 1;
        // } while (i < 11);

        // int i = 12;
        // while(i < 11) {
        //     System.out.println("Fuck Your Feelings");
        // }
        // // while loop doesnt needs terminator at the end.

        // do { 
        //     System.out.println("Fuck Your Feelings");
        // } while (i < 11);
        // // do while loop needs terminator at the end.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1ST QUESTION
        // int sum = 0;
        // for(int i=0; i<=n; i++) {
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        // 2ND QUESTION

        for(int i=1; i<11; i++) {
            System.out.println(n*i);
        }
    }
}
