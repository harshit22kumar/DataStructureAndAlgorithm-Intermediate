/*
Leaders in an array
Problem Description

Given an integer array A containing N distinct integers, you have to find all the leaders in the array A.

An element is leader if it is strictly greater than all the elements to its right side.

NOTE:The rightmost element is always a leader.


*/


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class LeaderElementInArray_BrutForce {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 2, 4, 4, 3));
        ArrayList<Integer> listLeader=solve(list);
        System.out.println(Arrays.toString(listLeader.toArray()));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<A.size();i++){
                int flag=1;
                for(int j=i+1;j<A.size();j++){
                    if(A.get(i)<A.get(j)){
                        flag=0;
                        break;
                    }
                }
                if(flag==1){
                    list.add(A.get(i));
                }
            }
            return list;
    }



}
