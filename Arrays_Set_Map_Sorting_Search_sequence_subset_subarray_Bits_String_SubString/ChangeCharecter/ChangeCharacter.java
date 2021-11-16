/*
*Change character
Problem Description

Given a string A of size N consisting of lowercase alphabets.

You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

Find the minimum number of distinct characters in the resulting string.



Problem Constraints
1 <= N <= 100000

0 <= B < N



Input Format
First argument is a string A.

Second argument is an integer B.



Output Format
Return an integer denoting the minimum number of distinct characters in the string.



Example Input
A = "abcabbccd"
B = 3



Example Output
2



Example Explanation
We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
So the minimum number of distinct character will be 2.
*
* */

package com.company.DSAlgo;

import java.util.Arrays;

public class ChangeCharacter {
    public static void main(String []args){
        System.out.println (solve("umeaylnlfd",1 ));
    }
    public static int solve(String A, int B) {
        int alpha;
        int []freq=new int[26];
        for(int i=0;i<A.length();i++){
            alpha=(int)A.charAt(i)-97;
            freq[alpha]++;
        }
        Arrays.sort(freq);
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                if(B-freq[i]>=0){
                    B=B-freq[i];
                    freq[i]=freq[i]-freq[i];
                }else{
                    break;
                }
            }
        }
        for(int ele:freq){
            if(ele>0)
                ans++;
        }
        return ans;
    }
}
