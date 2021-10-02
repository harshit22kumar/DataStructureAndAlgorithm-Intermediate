package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibiriumIndexInArray_Method1 {
    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 7, 1, 2, 3 ) );
        System.out.println ( solve ( list ) );
    }

    public static int solve(ArrayList < Integer > A) {
        Integer sum = 0; // initialize sum of whole array
        Integer leftsum = 0; // initialize leftsum

        /* Find sum of the whole array */
        for (int i = 0; i < A.size (); ++i)
            sum += A.get(i);

        for (int i = 0; i < A.size (); ++i)
        {
            sum -= A.get(i); // sum is now right sum for index i

            if (leftsum == sum)
                return i;

            leftsum += A.get(i);
        }

        /* If no equilibrium index found, then return -1 */
        return -1;
    }
}
