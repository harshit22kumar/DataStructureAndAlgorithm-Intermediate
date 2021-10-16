/**
 * Search in a row wise and column wise sorted matrix
 * Problem Description
 *
 * Given a matrix of integers A of size N x M and an integer B.
 * In the given matrix every row and column is sorted in increasing order.
 * Find and return the position of B in the matrix in the given form:
 * If A[i][j] = B then return (i * 1009 + j)
 * If B is not present return -1.
 *
 * Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
 * Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
 *
 * */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        ArrayList < ArrayList < Integer > > matrix = new ArrayList <> ();
        ArrayList < Integer > array = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 4 ) );
        matrix.add ( array );
        ArrayList < Integer > array2 = new ArrayList <> ( Arrays.asList ( 7, 8, 9, 10 ) );
        matrix.add ( array2 );
        ArrayList < Integer > array3 = new ArrayList <> ( Arrays.asList ( 13, 14, 15, 16 ) );
        matrix.add ( array3 );
        ArrayList < Integer > array4 = new ArrayList <> ( Arrays.asList ( 19, 20, 21, 22 ) );
        matrix.add ( array4 );
       System.out.println (solve ( matrix,2 ));

    }
    public static int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int i=0;int j=A.get(0).size()-1;
        int num;
        int temp_ans=-1;
        while(j>=0&&i<A.size()){
            num=A.get(i).get(j);
            if(B==num){
                temp_ans=  ((i+1) * 1009) + (j+1);
                j--;
            }else if(B<num||temp_ans!=-1){
                j--;
            }else{
                if(temp_ans==-1)
                    i++;
            }
        }
        return temp_ans;
    }
}

