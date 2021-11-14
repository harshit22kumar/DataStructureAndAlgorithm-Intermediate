/**
 * Equilibrium index of an array
 * Problem Description
 *
 * You are given an array A of integers of size N.
 *
 * Your task is to find the equilibrium index of the given array
 *
 * Equilibrium index of an array is an index such that the sum of
 * elements at lower indexes is equal to the sum of elements at higher indexes.
 *
 * NOTE:
 *
 * Array indexing starts from 0.
 * If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 *
 *Example Input
 * Input 1:
 * A=[-7, 1, 5, 2, -4, 3, 0]
 * Input 2:
 *
 * Example Output
 * Output 1:
 * 3
 * */


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EquilibiriumIndexInArray_Method2 {
    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 7, 1, 2, 3 ) );
        System.out.println ( solve ( list ) );
    }

    public static int solve(ArrayList < Integer > A) {
        int count = 0;
        for (int i = 0; i < A.size (); i++) {
            if (A.get ( i ) == 0) {
                count++;
            }
        }
        if (count == A.size ()) {
            return 0;
        }
        ArrayList < Integer > prefix = new ArrayList <> ();
        prefix.add ( A.get ( 0 ) );
        for (int i = 1; i < A.size (); i++) {
            prefix.add ( A.get ( i ) + prefix.get ( i - 1 ) );
        }
        for (int i = 1; i < prefix.size () - 1; i++) {
            if (prefix.get ( i - 1 ) == (prefix.get ( prefix.size () - 1 ) - prefix.get ( i ))) {
                return i;
            }
        }
        return -1;
    }
}
