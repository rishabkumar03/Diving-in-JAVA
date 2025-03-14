/*

PRINT A PALINDROMIC NUMBER PYRAMID

    11
   2112
  32123
 4321234
543212345

 */

package Learning.level6;

public class AdvPattern4 {
    public static void main(String[] args) {
        int n = 5;

        for (int i=1; i<=n; i++) {

            // spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // 1st half numbers
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }

            // 2nd half numbers
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }

        System.out.println();
        }
    }
}
