/*
* Teams
Given a string A, A is made up of 0's and 1's. Break A into substrings such that , all broken substrings have equal number of 1's and 0's.

Find and return maximum number of substrings in which A can be broken.


Input Format

The only argument given is string A.
Output Format

Find and return maximum number of substrings in which A can be broken.
Constraints

1 <= length of A <= 10^5
A will always have equal number of 0's and 1's
For Example

Input 1:
    A = "011100"
Output 1:
    2
Explanation 1:
    "01" + "1100"

Input 2:
    A = "00011011"
Output 2:
    1
Explanation 2:
    "00011011"
* */

package com.company.DSAlgo;

public class Teams {

    int Solution::solve(string A) {
        int substr=0;
        vector<int> prefix;
        for(char chr:A){
            if(chr=='0'){
                prefix.push_back(1);
            }else{
                prefix.push_back(-1);
            }
        }
        for(int i=1;i<prefix.size();i++){
            prefix[i]=prefix[i-1]+prefix[i];
        }
        for(int ele:prefix){
            if(ele==0){
                substr++;
            }
        }
        return substr;
    }

}
