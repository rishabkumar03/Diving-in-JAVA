/* 
 
PRINT A HOLLOW BUTTERFLY

*        *
**      ** 
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *

*/

package PracticePaper.level6;

public class AdvPatternProb1 {
    public static void main(String[] args) {
        int n = 5;

        // upper half
        for (int i=1; i<=n; i++) {

            // hollow right angled triangle
            for (int j=1; j<=i; j++){
                if ( j==1 || j==i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // hollow inverted right angled triangle
            for (int j=1; j<=i; j++){
                if ( j==1 || j==i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } 

            System.out.println();
        }

        // lower half
        for (int i=n; i>=1; i--) {

            // hollow right angled triangle
            for (int j=1; j<=i; j++){
                if ( j==1 || j==i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // hollow inverted right angled triangle
            for (int j=1; j<=i; j++){
                if ( j==1 || j==i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}
