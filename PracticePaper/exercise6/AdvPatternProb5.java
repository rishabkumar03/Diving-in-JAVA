/*
 
PRINT INVERTED HALF PYRAMID

11111
2222
333
44
5

 */

package PracticePaper.exercise6;

public class AdvPatternProb5 {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int i=1; i<=n; i++){

            // inner loop
            for (int j=0; j<=n-i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
