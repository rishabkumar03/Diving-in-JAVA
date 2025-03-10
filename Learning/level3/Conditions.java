/*
 
CONDITIONAL STATEMENTS

IF-ELSE

The if block is used to specify the code to be executed if the condition specified  in if is true, the else block is executed otherwise.

SWITCH

Switch case statements are a substitute for long if statements that compare a variable to multiple values. 
After a match is found, it executes the corresponding code of that value case.

 */

package level3;

import java.util.*;

public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if(button == 1) {
        //     System.out.println("Hello");
        // } else if(button == 2) {
        //     System.out.println("Namaste");
        // } else if(button == 3) {
        //     System.out.println("Bonjour");
        // } else{
        //     System.out.println("Out of option");
        // }

        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Hamba Hamba Rumba Rumba Bomba Bomba");
        }
    }

}

