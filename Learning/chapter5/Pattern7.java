/*
 
INVERTED HALF PYRAMID WITH NUMBERS

12345
1234
123
12
1

 */

package chapter5;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
