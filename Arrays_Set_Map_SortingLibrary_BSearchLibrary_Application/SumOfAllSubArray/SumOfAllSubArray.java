package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfSubArray {
    public static void main(String []args){
        List<Integer> list = new ArrayList<>(Arrays.asList(3,7,90,20,10));
        subArray(list);
    }

    public static void subArray(final List<Integer> A) {
        int sum;
        for(int i=0;i<A.size();i++){
            for(int j=i;j<A.size();j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+A.get(k);
                }
                System.out.println(sum);
            }
        }
    }


}
