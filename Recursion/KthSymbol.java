/*
* Kth Symbol
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA
Problem Description

On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row A and index B, return the Bth indexed symbol in row A. (The values of B are 1-indexed.) (1 indexed).



Problem Constraints

1 <= A <= 20

1 <= B <= 2A - 1



Input Format

First argument is an integer A.

Second argument is an integer B.



Output Format

Return an integer denoting the Bth indexed symbol in row A.



Example Input

Input 1:

 A = 2
 B = 1
Input 2:

 A = 2
 B = 2


Example Output

Output 1:

 0
Output 2:

 1


Example Explanation

Explanation 1:

 Row 1: 0
 Row 2: 01
Explanation 2:

 Row 1: 0
 Row 2: 01
*
* */

//Solve Using Recursion

package com.company.DSAlgo;

public class KthSymbol {
    public int solve(int A, int B) {
        StringBuilder ans = new StringBuilder ();
        ans = ans.append ( "01" );
        if (A == 1) {
            return 0;
        } else if (A == 2) {
            if (B == 1) {
                return 0;
            } else {
                return 1;
            }
        } else {
            A = A - 2;
            while (A > 0) {
                StringBuilder S = new StringBuilder ();
                for (int i = 0; i < ans.length (); i++) {
                    if (ans.charAt ( i ) == '1') {
                        S = S.append ( "10" );
                    } else if (ans.charAt ( i ) == '0') {
                        S = S.append ( "01" );
                    }
                }
                ans = S;
                A--;
            }
        }
        int ansInt = (int) ans.charAt ( B - 1 ) - 48;
        return ansInt;
    }
}
