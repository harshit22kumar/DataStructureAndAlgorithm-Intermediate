/*
 * Multiple left rotations of the array
 * Problem Description
 *
 * Given an array of integers A and multiple values in B which represents number of
 * times array A needs to be left rotated.
 *
 * Find the rotated array for each value and return the result in the from of
 * a matrix where i'th row represents the rotated array for the i'th value in B.
 * */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleLeftRotationOfArray {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,7,90,20,10));
        ArrayList<Integer> rotationList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<ArrayList<Integer>> matrix=solve(list,rotationList);
        for (ArrayList<Integer> a:matrix)
            System.out.println(a.toString());
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        ArrayList<Integer> list;
        for (Integer integer : B) {
            list = rotateAnArray(A, integer);
            matrix.add(list);
        }
        return matrix;
    }

    private static ArrayList<Integer> rotateAnArray(ArrayList<Integer> a, Integer integer) {
        ArrayList<Integer> list = new ArrayList<>(a);
        integer=integer%a.size();
        reverseAnArray(list,0,list.size()-1);
        reverseAnArray(list,0,list.size()-integer-1);
        reverseAnArray(list,list.size()-integer,list.size()-1);
        return list;
    }

    private static void reverseAnArray(ArrayList<Integer> a,Integer start, Integer end) {
        while(start<end){
            int temp=a.get(start);
            a.set(start,a.get(end));
            a.set(end,temp);
            start++;
            end--;
        }
    }
}
