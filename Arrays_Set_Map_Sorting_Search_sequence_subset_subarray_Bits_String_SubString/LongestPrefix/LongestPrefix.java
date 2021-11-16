/*
* Longest Common Prefix
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA
Problem Description

Given the array of strings A, you need to find the longest string S which is the prefix of ALL the strings in the array.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

For Example: longest common prefix of "abcdefgh" and "abcefgh" is "abc".



Problem Constraints

0 <= sum of length of all strings <= 1000000



Input Format

The only argument given is an array of strings A.



Output Format

Return the longest common prefix of all strings in A.



Example Input

Input 1:

A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:

A = ["abab", "ab", "abcd"];


Example Output

Output 1:

"a"
Output 2:

"ab"


Example Explanation

Explanation 1:

Longest common prefix of all the strings is "a".
Explanation 2:

Longest common prefix of all the strings is "ab".
*
* */
package com.company.DSAlgo;

import java.util.ArrayList;

public class LongestPrefix {
    public String longestCommonPrefix(ArrayList <String> A) {
        if(A.size()==1){
            return A.get(0);
        }
        String s=A.get(0);
        String k=A.get(1);
        StringBuilder pre=new StringBuilder();
        pre=findPrefix(s,k);
        for(int i=2;i<A.size();i++){
            pre=findPrefix(pre.toString(),A.get(i));
        }
        return pre.toString();
    }
    private StringBuilder findPrefix(String s,String k){
        StringBuilder pre=new StringBuilder();
        int i=0;
        while(i<s.length()&&i<k.length()){
            if(s.charAt(i)==k.charAt(i)){
                pre.append(s.charAt(i));
            }else{
                break;
            }
            i++;
        }
        return pre;
    }
}
