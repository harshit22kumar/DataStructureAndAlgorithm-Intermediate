/*
* Row with maximum number of ones
Problem Description

Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.

NOTE:

If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows).


Problem Constraints
1 <= N <= 1000

0 <= A[i] <= 1



Input Format
The only argument given is the integer matrix A.



Output Format
Return the row with the maximum number of 1.



Example Input
Input 1:

 A = [   [0, 1, 1]
         [0, 0, 1]
         [0, 1, 1]   ]
Input 2:

 A = [   [0, 0, 0, 0]
         [0, 1, 1, 1]    ]


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 Row 0 has maximum number of 1s.
Explanation 2:

 Row 1 has maximum number of 1s.
*
* */


//Optimized solution can be by using concept of row and column wise sorted matrix searching
package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class RowWithMaxOnes {
    public static void main(String []args) {
        ArrayList < ArrayList < Integer > > A = new ArrayList <> ();
        ArrayList < Integer > array = new ArrayList <> ( Arrays.asList ( 1, 2, 3 ) );
        A.add ( array );
        ArrayList < Integer > array2 = new ArrayList <> ( Arrays.asList ( 4, 5, 6 ) );
        A.add ( array2 );
        ArrayList < Integer > array3 = new ArrayList <> ( Arrays.asList ( 7, 8, 9 ) );
        A.add ( array3 );
        System.out.println (solve ( A ));
    }

    public static int solve(ArrayList< ArrayList <Integer> > A) {
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=0;i<A.size();i++){
            int tempMax=0;
            for(int j=0;j<A.get(i).size();j++){
                if(A.get(i).get(j)==1){
                    tempMax++;
                }
            }
            if(tempMax>max){
                max=tempMax;
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
