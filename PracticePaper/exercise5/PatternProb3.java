/*

PRINT A PALINDROMIC NUMBER PYRAMID

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

 */

package PracticePaper.exercise5;

public class PatternProb3 {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int i=1; i<=n; i++) {

            // inner loop
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            } 

            for (int j=i; j>=1; j--){
                System.out.print(j+" ");
            }

            for (int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            
        System.out.println();
        }

    }
}
