/*
 *Rotate Matrix
Problem Description

You are given a n x n 2D matrix A representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.



Problem Constraints
1 <= n <= 1000



Input Format
First argument is a 2D matrix A of integers



Output Format
Return the 2D rotated matrix.



Example Input
Input 1:

 [
    [1, 2],
    [3, 4]
 ]
Input 2:

 [
    [1]
 ]


Example Output
Output 1:

 [
    [3, 1],
    [4, 2]
 ]
Output 2:

 [
    [1]
 ]


Example Explanation
Explanation 1:

 After rotating the matrix by 90 degree:
 1 goes to 2, 2 goes to 4
 4 goes to 3, 3 goes to 1
Explanation 2:

 2D array remains the ssame as there is only element.
 *
 *
 * */



package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateClockWise {
    public static void main(String[] args) {
        ArrayList < ArrayList <Integer> >matrix = new ArrayList<>();
        ArrayList<Integer> array=new ArrayList <> ( Arrays.asList ( 1,2 ));
        matrix.add (array);
        ArrayList<Integer> array2=new ArrayList <> (Arrays.asList ( 3,4 ));
        matrix.add ( array2 );
        //ArrayList<Integer> array3=new ArrayList <> (Arrays.asList ( 7,8,9 ));
       // matrix.add ( array3 );


        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.get(i).size();j++){
                System.out.print(matrix.get(i).get ( j )+" ");
            }
            System.out.println ();
        }
        solve (matrix);
       System.out.println (  matrix.toString ());
    }
    public  static  void solve(ArrayList<ArrayList<Integer>> A) {
            int temp;
            for(int i=0;i<A.size();i++){
                for(int j=i;j<A.get(i).size();j++) {
                    temp = A.get ( i ).get ( j );
                    A.get ( i ).set ( j, A.get ( j ).get ( i ) );
                    A.get ( j ).set ( i, temp );
                }
            }
                for(ArrayList<Integer> row:A) {
                    reverse ( row );
                }
        }
        public static void reverse(ArrayList<Integer> row) {
            int begin = 0;
            int end = row.size () - 1;
            int temp;
            while (begin <end) {
                temp = row.get ( end );
                row.set ( end, row.get ( begin ) );
                row.set ( begin, temp );
                begin++;
                end--;
            }
        }
}
