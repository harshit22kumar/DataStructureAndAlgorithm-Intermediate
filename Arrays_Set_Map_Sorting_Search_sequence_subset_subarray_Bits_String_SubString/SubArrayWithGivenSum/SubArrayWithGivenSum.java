/*Problem Description

Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.



Problem Constraints

1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109



Input Format

The first argument given is the integer array A.

The second argument given is integer B.



Output Format

Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".



Example Input

Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110


Example Output

Output 1:

 [2, 3]
Output 2:

 -1


Example Explanation

Explanation 1:

 [2, 3] sums up to 5.
Explanation 2:

 No subarray sums up to required number.
 *
 *
 * */


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 7, 1, 2, 3 ) );
        System.out.println ( solve ( list ,3) );
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList <Integer> list=new ArrayList<>();
        long totalSum=0;
        if(B<0){
            list.add(-1);
            return list;
        }
        if(A.size()==1&&A.get(0)!=B){
            list.add(-1);
            return list;
        }
        for(int ele:A){
            totalSum=totalSum+ele;
        }
        if(B>totalSum){
            list.add(-1);
            return list;
        }
        int i=0;int j=1;
        int sum=A.get(i);
        while(i<A.size()){
            if(sum==B){
                break;
            }else if(sum<B&&j<A.size()){
                sum=sum+A.get(j);
                j++;
            }else if((sum>B&&i<A.size())||(i<A.size()&&j==A.size())){
                sum=sum-A.get(i);
                i++;
            }
        }
        if(i<A.size()){
            for(int k=i;k<j;k++){
                list.add(A.get(k));
            }
        }else{
            list.add(-1);
        }
        return list;
    }
}
