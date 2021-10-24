/*
* Diffk II
Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :

Input :

A : [1 5 3]
k : 2
Output :

1
as 3 - 1 = 2

Return 0 / 1 for this problem.

×

* */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DiffTwo {
    public static void main(String []args){
        System.out.println (diffPossible(new ArrayList <> ( Arrays.asList ( 8, 15, 1, 10, 5, 19, 19, 3, 5, 6, 6, 2, 8, 2, 12, 16, 3 )),1));
    }


    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int diffPossible(final List <Integer> A, int B) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        int ans=0;
        for(int ele:A){
            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }
        }
        int target;
        for(int ele:A){
            target=ele+B;
            if(ele!=target){
                if(hm.containsKey(target)){
                    ans=1;
                    break;
                }
            }else{
                if(hm.get(target)>=2){
                    ans=1;
                    break;
                }
            }
        }
        return ans;
    }

}
