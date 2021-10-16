/**
 * Anti Diagonals
 * Problem Description
 *
 * Give a N * N square matrix A, return an array of its anti-diagonals.
 * Look at the example for more details.
 *
 *
 * Problem Constraints
 * 1<= N <= 1000
 * 1<= A[i][j] <= 1e9
 *
 *
 * Input Format
 * First argument is an integer N, denoting the size of square 2D matrix.
 * Second argument is a 2D array A of size N * N.
 *
 *
 * Output Format
 * Return a 2D integer array of size (2 * N-1) * N, representing
 * the anti-diagonals of input array A.
 * The vacant spaces in the grid should be assigned to 0.
 *
 *
 * Example Input
 * Input 1:
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Input 2:
 *
 * 1 2
 * 3 4
 *
 *
 * Example Output
 * Output 1:
 * 1 0 0
 * 2 4 0
 * 3 5 7
 * 6 8 0
 * 9 0 0
 * Output 2:
 *
 * 1 0
 * 2 3
 * 4 0
 *
 *
 * Example Explanation
 * For input 1:
 * The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
 * The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
 * The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
 * The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
 * The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
 * For input 2:
 *
 * The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
 * The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
 * The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].
 *
 *
 * */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class printDiagonalOfSquareMatrix {
    public static void main(String []args) {
        ArrayList < ArrayList < Integer > > matrix = new ArrayList <> ();
        ArrayList < Integer > array = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 4 ) );
        matrix.add ( array );
        ArrayList < Integer > array2 = new ArrayList <> ( Arrays.asList ( 7, 8, 9, 10 ) );
        matrix.add ( array2 );
        ArrayList < Integer > array3 = new ArrayList <> ( Arrays.asList ( 13, 14, 15, 16) );
        matrix.add ( array3 );
        ArrayList < Integer > array4 = new ArrayList <> ( Arrays.asList ( 19, 20, 21, 22) );
        matrix.add ( array4 );
        for(ArrayList<Integer> list:diagonal(matrix)){
            System.out.println (list.toString ());
        }
    }
    public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int row,col;
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        for(int i=0;i<A.get(0).size();i++){
            ArrayList<Integer> list=new ArrayList<>();
            row=0;col=i;
            while(col>=0){
                list.add(A.get(row).get(col));
                row++;
                col--;
            }
            for(int k=row;k<A.get(0).size();k++){
                list.add(0);
            }
            matrix.add(list);
        }
        for(int i=1;i<A.size();i++){
            ArrayList<Integer> list=new ArrayList<>();
            row=i;col=A.get(0).size()-1;
            while(row<A.size()){
                list.add(A.get(row).get(col));
                row++;col--;
            }
            for(int k=col;col>=0;col--){
                list.add(0);
            }
            matrix.add(list);
        }
        return matrix;
    }
}
