package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAnArray {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 2, 4, 4, 3));
        ArrayList<Integer> listLeader=solve(list);
        System.out.println(Arrays.toString(listLeader.toArray()));
    }

    public static ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=A.size()-1;i>=0;i--){
            list.add(A.get(i));
        }
        return list;
    }
}
