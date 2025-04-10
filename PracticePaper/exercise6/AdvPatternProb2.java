/*
 
PRINT A HOLLOW RHOMBUS

    *****
   *   *
  *   *
 *   *
*****

 */

package PracticePaper.exercise6;

public class AdvPatternProb2 {
    public static void main(String[] args) {
        int n = 5;

        for (int i=1; i<=n; i++) {

            // spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            if ( i==1 || i==n ){
                // completely filled stars
                for (int j=1; j<=n; j++){
                    System.out.print("*");
                } 
            } else {
                // first and last star
                System.out.print("*");
                // Gaps between the stars
                for (int j=1; j<=n-2; j++){
                    System.out.print(" ");
                }
                // last star
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
