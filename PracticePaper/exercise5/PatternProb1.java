/*

PRINT A SOLID RHOMBUS.

    *****
   ***** 
  *****  
 *****   
*****    

 */

package PracticePaper.exercise5;

public class PatternProb1 {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int i=1; i<=n; i++) {
            // inner loop (initial space)
            for (int j=1; j<=n-i; j++) {  
                System.out.print(" ");
            }

            // inner loop (star)
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
