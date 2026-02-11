package Chapter_03;

import java.util.Arrays;

public class ss_03_nonPrimitive_dataTypes {
    public static void main(String[] args) {
        /*
        Non-Primitive data types
        --> Non-primitive data types (also called Reference data types) are used to store multiple values, complex data, or objects.
        --> They do not store the actual value directly; instead, they store the memory address (reference) of the data.

        -- String
        -- Array
        -- Class
        -- Interface
        -- Object
        **/

        // String
        String name = "Sohan singh";
        System.out.println("My name is " + name);

        // Array
        int[] arr = {10, 20 ,30, 40, 50};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);     // accessing index 2 = 30

        //Class

        
    }
}
