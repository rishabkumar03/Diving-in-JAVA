/*
 
VARIABLES

A variable is a container (storage area) used to hold data.
Each variable should be given a unique name (identifier).

DATA TYPES

Data types are declaration for variables.
This determines the type and size of data associated with variables which is essential to know since different data types occupy different sizes of memory.

There are 2 types of Data Types :
    -Primitive Data Types: to store simple values 
    -Non-Primitive Data Types: to store complex values

PRIMITIVE DATA TYPES

These are the data types of fixed size.

| Data Type | Meaning                      | Size (Bytes)| Range / Precision                                        |
|-----------|------------------------------|-------------|----------------------------------------------------------|
| `byte`    | 2’s complement integer       | 1           | -128 to 127                                              |
| `short`   | 2’s complement integer       | 2           | -32,768 to 32,767                                        |
| `int`     | Integer                      | 4           | -2,147,483,648 to 2,147,483,647                          |
| `long`    | 2’s complement integer       | 8           | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807  |
| `float`   | Floating-point number        | 4           | ~6 to 7 decimal digits                                   |
| `double`  | Double precision float       | 8           | ~15 to 16 decimal digits                                 |
| `char`    | Character                    | 2 (Java)    / 1 (C++) | 'a', 'A', '@', '#' etc.                        |
| `boolean` | Boolean                      | 1 (Java)    / 1 bit (C++) | `true`, `false`                            |

NON-PRIMITIVE DATA TYPES

These are of variable size & are usually declared with a ‘new’ keyword.
Eg : String, Arrays

CONSTANTS

A constant is a variable in Java which has a fixed value i.e. it cannot be assigned a different value once assigned.

 */

package level2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        // nextInt() for integer
        // nextFloat() for decimal
        System.out.println(sum);
    }
}
