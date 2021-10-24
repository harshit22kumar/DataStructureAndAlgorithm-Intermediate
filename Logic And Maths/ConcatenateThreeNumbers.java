/*
* Concatenate Three Numbers
Problem Description

Given three 2-digit integers, A, B and C, find out the minimum number
 that can be obtained by concatenating them in any order.

Return the minimum result that can be obtained.



Problem Constraints
10 <= A, B, C <= 99



Input Format
The first argument of input contains an integer, A.

The second argument of input contains an integer, B.

The third argument of input contains an integer, C.



Output Format
Return an integer, representing the answer.



Example Input
Input 1:

 A = 10
 B = 20
 C = 30
Input 2:

 A = 55
 B = 43
 C = 47


Example Output
Output 1:

 102030
Output 2:

 434755


Example Explanation
Explanation 1:

 10 + 20 + 30 = 102030
Explanation 2:

 43 + 47 + 55 = 434755
*
* */

package com.company.DSAlgo;

public class ConcatenateThreeNumbers {
    public static void main(String[] args){
        System.out.println (solve(10,20,30));
    }


    public static int solve(int A, int B, int C) {
        int first,second,third;
        if(A<B){
            if(A<C){
                first=A;
                if(B<C){
                    second=B;
                    third=C;
                }else{
                    second=C;
                    third=B;
                }
            }else{
                first=C;
                second=A;
                third=B;
            }
        }else{
            if(A<C){
                second=A;
                first=B;
                third=C;
            }else{
                third=A;
                if(C<B){
                    first=C;
                    second=B;
                }else{
                    second=C;
                    first=B;
                }
            }
        }
        return Integer.parseInt( first +String.valueOf(second)+ third );
    }
}
