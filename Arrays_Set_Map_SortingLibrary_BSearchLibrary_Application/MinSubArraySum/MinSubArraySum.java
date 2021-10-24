package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class MinSubArraySum {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(solve(list,2));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        //Optimized solution using sliding window
        int sum = 0;
        int index = 0;
        int min;
        for (int i = 0; i < B; i++) {
            sum = sum + A.get(i);
        }
        min = sum;
        for (int i = 1; i <= A.size() - B; i++) {
            int j = i + B - 1;
            sum = sum - A.get(i - 1);
            sum = sum + A.get(j);
            if (sum < min) {
                index = i;
                min = sum;
            }
        }
        return index;
    }
}
