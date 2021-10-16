package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SetRowColumnZero {
    public static void main(String []args) {
        ArrayList < ArrayList < Integer > > matrix = new ArrayList <> ();
        ArrayList < Integer > array = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 4 ) );
        matrix.add ( array );
        ArrayList < Integer > array2 = new ArrayList <> ( Arrays.asList ( 7, 8, 9, 0) );
        matrix.add ( array2 );
        ArrayList < Integer > array3 = new ArrayList <> ( Arrays.asList ( 13, 14, 0, 16 ) );
        matrix.add ( array3 );
        for(ArrayList<Integer> list:matrix){
            System.out.println(list.toString ());
        }
        System.out.println ("================");
        for(ArrayList<Integer> list:solve(matrix)){
            System.out.println(list.toString ());
        }

    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        for (ArrayList < Integer > integers : A) {
            ArrayList < Integer > list = new ArrayList <> ();
            boolean zero = false;
            for (Integer integer : integers) {
                if (integer != 0) {
                    list.add ( integer );
                } else {
                    zero = true;
                    break;
                }
            }
            if (zero) {
                ArrayList < Integer > zeroList = new ArrayList <> ( Collections.nCopies ( integers.size (), 0 ) );
                matrix.add ( zeroList );
            } else {
                matrix.add ( list );
            }
        }
        for(int i=0;i<A.get(0).size();i++){
            for (ArrayList < Integer > integers : A) {
                if (integers.get ( i ) == 0) {
                    setColumnZero ( i, matrix );
                }
            }
        }
        return matrix;
    }

    private static void setColumnZero(int i, ArrayList < ArrayList < Integer > > matrix) {
        for (ArrayList < Integer > integers : matrix) {
            integers.set ( i, 0 );
        }
    }
}
