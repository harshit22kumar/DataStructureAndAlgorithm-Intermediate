/*
* Given an array of integers A and an integer B. Find and return the maximum value of | s1 - s2 |

where s1 = sum of any subset of size B, s2 = sum of elements of A - sum of elemets of s1

Note |x| denotes the absolute value of x.


Input Format

The arguments given are the integer array A and integer B.
Output Format

Return the maximum value of | s1 - s2 |.
Constraints

1 <= B < length of the array <= 100000
1 <= A[i] <= 10^5
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
    B = 2
Output 1:
    9

Input 2:
    A = [5, 17, 100, 11]
    B = 3
Output 2:
    123
*
*
*
*/

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class MaxDiff {
    public int solve(ArrayList <Integer> A, int B) {
        long sum=0;
        long subSetSumFromFirst=0;
        long subSetSumFromLast=0;
        long ans=0;
        Collections.sort(A);
        for(int i=0;i<A.size();i++){
            sum=sum+A.get(i);
        }
        int c=0;
        int i=0;
        while(i<A.size()&&c<B){
            subSetSumFromFirst=subSetSumFromFirst+A.get(i);
            i++;
            c++;
        }
        c=0;
        i=A.size()-1;
        while(i>=0&&c<B){
            subSetSumFromLast=subSetSumFromLast+A.get(i);
            i--;
            c++;
        }
        if((Math.abs(2*subSetSumFromFirst-sum))>(Math.abs(2*subSetSumFromLast-sum))) {
            ans=Math.abs(2*subSetSumFromFirst-sum);
        }else{
            ans=Math.abs(2*subSetSumFromLast-sum);
        }

        return (int)(ans);
    }
}
