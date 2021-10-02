/**
 * Given a String S all alphabet of upper case, find all pairs of i,j such that i<j
 * where S[i]= A and S[j]= G.
 *
 * BACGGAAG- total 5 pairs
 * */

package com.company.DSAlgo;


import java.util.ArrayList;
import java.util.Arrays;

public class SubSequenceAG {
    public static void main(String[] args) {
       String S="BACGGAAG";
        System.out.println ( S );
    }
    public static int solve(String A) {
        int count=0;
        int g=0;
        for(int i=A.length()-1;i>=0;i--){
            if(A.charAt(i)=='G'){
                g++;
            }else if(A.charAt(i)=='A'){
                count+=g;
            }
        }
        return (count%1000000007);
    }
}
