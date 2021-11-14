/**
 * Problem Description
 *
 * You are given an array of N integers, A1, A2 ,…, AN and an integer B. Return the of count of distinct numbers in all windows of size B.
 *
 * Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
 *
 * NOTE: if B > N, return an empty array.
 *
 *
 *
 * Input Format
 *
 * First argument is an integer array A
 * Second argument is an integer B.
 *
 *
 *
 * Output Format
 *
 * Return an integer array.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = [1, 2, 1, 3, 4, 3]
 *  B = 3
 * Input 2:
 *
 *  A = [1, 1, 2, 2]
 *  B = 1
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  [2, 3, 3, 2]
 * Output 2:
 *
 *  [1, 1, 1, 1]
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  A=[1, 2, 1, 3, 4, 3] and B = 3
 *  All windows of size B are
 *  [1, 2, 1]
 *  [2, 1, 3]
 *  [1, 3, 4]
 *  [3, 4, 3]
 *  So, we return an array [2, 3, 3, 2].
 * Explanation 2:
 *
 *  Window size is 1, so the output array is [1, 1, 1, 1].
 *
 *
 *
 * */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DistictNumberInWindow {
    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 7, 1, 2, 3 ) );
        System.out.println ( dNums ( list,2 ) );
    }
    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> list=new ArrayList<>();
        if(A.size()<B){
            return list;
        }
        HashMap <Integer,Integer> map=createMap(A,B);
        int i=0;int j=B;
        list.add(map.size());
        while(j<A.size()){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i),map.get(A.get(i))-1);
                if(map.get(A.get(i))<=0){
                    map.remove(A.get(i));
                }
            }
            if(map.containsKey(A.get(j))){
                map.put(A.get(j),map.get(A.get(j))+1);
            }else{
                map.put(A.get(j),1);
            }
            list.add(map.size());
            j++;
            i++;
        }
        return list;
    }
    public static HashMap<Integer,Integer> createMap(ArrayList<Integer> A,int B){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<B;i++){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i),map.get(A.get(i))+1);
            }else{
                map.put(A.get(i),1);
            }
        }
        return map;
    }
}
