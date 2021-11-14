/*
* Problem Description

Given an array A of N integers.

Find the largest continuous sequence in a array which sums to zero.



Problem Constraints
1 <= N <= 106

-107 <= A[i] <= 107



Input Format
Single argument which is an integer array A.



Output Format
Return an array denoting the longest continuous sequence with total sum of zero.

NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.



Example Input
A = [1,2,-2,4,-4]


Example Output
[2,-2,4,-4]


Example Explanation
[2,-2,4,-4] is the longest sequence with total sum of zero.
* */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestContinuousSequenceSumZero {
    public static void main(String []args){
        System.out.println (lszero(new ArrayList <> ( Arrays.asList ( 1,2,-2,4,-4))).toString ());
        System.out.println (lszero(new ArrayList <> ( Arrays.asList ( 1, 2, -3, 3))).toString ());
    }

    public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
        Map <Long,Integer> map=new HashMap <> ();
        map.put ( 0L,-1 );
        int start_index=10000000;
        int end_index=10000000;
        long pre=0;
        int ans=0;
        for(int i=0;i<A.size();i++) {
            pre = pre + A.get ( i );
            if (map.containsKey ( pre )) {
                if (i - map.get ( pre ) > ans) {
                    ans=i - map.get ( pre );
                    start_index = map.get ( pre )+1;
                    end_index = i;
                }
            } else {
                    map.put ( pre, i );
            }
        }
        ArrayList<Integer> list=new ArrayList <> ();
        if(start_index!=10000000&&end_index!=10000000){
            for(int i=start_index;i<=end_index;i++){
                list.add(A.get(i));
            }
        }
        return list;
    }

}
