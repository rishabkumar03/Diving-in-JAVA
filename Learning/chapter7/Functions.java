/*
 
FUNCTIONS 

It is a block of code that performs a specific task.

WHY ARE FUNCTIONS USED?

a) If some functionality is performed at multiple places, then rather than writing the same code again and again, we create a function and call it everywhere. This helps reduce code redundancy.
b) Functions make maintenance of code easy as we have to change at one place if we make further changes to functionality.
c) Functions make the code more readable and easy to understand.

SYNTAX

return-type function_name (parameter 1, parameter 2, .... parameter n) {
// function body
}
return-type

RETURN TYPE

It is the data type of the variable that function returns

For e.g. - If we write a function that adds 2 integers and returns their sum then the return type of this function will be 'int' as we will return a sum that is an integer value. When a function does not return any value, in that case the return type of the function is 'void'. 

 */

// Print a given name in a function

package chapter7;

import java.util.*;

public class Functions {
    public static void PrintMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your name please: ");
        String name = sc.next();

        PrintMyName(name); //function has been called 
    }
}
