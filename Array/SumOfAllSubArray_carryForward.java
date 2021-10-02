package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfAllSubArray_carryForward {
    public static void main(String []args){
        List<Integer> list = new ArrayList<>(Arrays.asList(3,7,90,20,10));
        subArray(list);
    }
    //O(n^2)
    public static void subArray(final List<Integer> A) {
        int sum;
        long startTime = System.nanoTime();
        for(int i=0;i<A.size();i++){
            sum=0;
            for(int j=i;j<A.size();j++){
                sum=sum+A.get(j);
                System.out.println(sum);
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("/***Total_Time***/");
        System.out.println(totalTime);
        System.out.println(totalTime+" ns");
    }
}
