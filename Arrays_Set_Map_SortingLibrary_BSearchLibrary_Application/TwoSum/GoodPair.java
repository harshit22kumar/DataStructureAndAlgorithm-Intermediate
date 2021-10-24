/**
 * Good Pair
 * Problem Description
 *
 * Given an array A and a integer B. A pair(i,j) in the array is a good pair if i!=j
 * and (A[i]+A[j]==B). Check if any good pair exist or not.
 *
 * There are better approach to solve this question,which is there in Intermediate section.
 * */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class GoodPair {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 2, 4, 4, 3));
        System.out.println(solve(list,8));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        for(int i=0;i<A.size();i++){
            for(int j=i+1;j<A.size();j++){
                if(A.get(i)+A.get(j)==B){
                    return 1;
                }
            }
        }
        return 0;
    }
}
