package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String []args) {
        ArrayList < ArrayList < Integer > > A = new ArrayList <> ();
        ArrayList < ArrayList < Integer > > B = new ArrayList <> ();
        ArrayList < Integer > array = new ArrayList <> ( Arrays.asList ( 1, 2, 3 ) );
        A.add ( array );
        B.add ( array );
        ArrayList < Integer > array2 = new ArrayList <> ( Arrays.asList ( 4, 5, 6) );
        A.add ( array2 );
        B.add ( array2 );
        ArrayList < Integer > array3 = new ArrayList <> ( Arrays.asList ( 7, 8, 9 ) );
        A.add ( array3 );
        B.add ( array3 );
        for (ArrayList < Integer > list : solve ( A,B )) {
            System.out.println ( list.toString () );
        }
    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> mul=new ArrayList<>();
        int temp;
        for (ArrayList < Integer > integers : A) {
            ArrayList < Integer > list = new ArrayList <> ();
            for (int j = 0; j < B.get ( 0 ).size (); j++) {
                temp = 0;
                for (int k = 0; k < integers.size (); k++) {
                    temp = temp + (integers.get ( k ) * B.get ( k ).get ( j ));
                }
                list.add ( temp );
            }
            mul.add ( list );
        }
        return mul;
    }
}
