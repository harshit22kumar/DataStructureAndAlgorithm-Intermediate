/*
N/3 Repeat Number
Problem Description

You're given a read only array of n integers. Find out if any integer occurs more than n/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Example:

Input: [1 2 3 1 1]
Output: 1
1 occurs 3 times which is more than 5/3 times.
*
* */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatNumber {
    public static void main(String []args){
        System.out.println (repeatedNumber(new ArrayList <> ( Arrays.asList (1 ,2 ,3 ,1 ,1)) ) );
    }
    public static int repeatedNumber(final List<Integer> A) {
        int freq1=0,freq2=0,ans=-1,bag1=-1,bag2=-1,ele;
        for (Integer integer : A) {
            ele = integer;
            if (bag1 == ele || bag2 == ele) {
                if (bag1 == ele) {
                    freq1++;
                } else {
                    freq2++;
                }
            } else if (freq1 == 0 || freq2 == 0) {
                if (freq1 == 0) {
                    freq1++;
                    bag1 = ele;
                } else {
                    freq2++;
                    bag2 = ele;
                }
            } else {
                freq1--;
                freq2--;
            }
        }
        int arrFreq1=0;
        int arrFreq2=0;
        for(int element:A){
            if(bag1==element){
                arrFreq1++;
            }
            if(bag2==element){
                arrFreq2++;
            }
        }
        if(arrFreq1>(A.size()/3)){
            ans=bag1;
        }else if(arrFreq2>(A.size()/3)){
            ans=bag2;
        }
        return ans;
    }
}
