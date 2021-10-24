/*
* Majority Element
Problem Description

Given an array of size n, find the majority element. 
The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exist in the array.

Example :

Input : [2, 1, 2]
Return  : 2 which occurs 2 times which is greater than 3/2.
*
* */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {
    public static void main(String []args){
        System.out.println (majorityElement(new ArrayList <> ( Arrays.asList (2, 1, 2)) ) );
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int majorityElement(final List <Integer> A) {
        int bag=A.get(0);
        int freq=1;
        int ans=A.get(0);
        for(int i=1;i<A.size();i++){
            if(freq==0){
                bag=A.get(i);
                freq++;
            }else if(bag==A.get(i)&&freq>0){
                freq++;
            }else {
                freq--;
            }
        }
        int arrFreq=0;
        for(int ele:A){
            if(bag==ele){
                arrFreq++;
            }
        }
        if(arrFreq>(A.size()/2)){
            ans=bag;
        }
        return ans;
    }
}
