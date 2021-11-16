/*
*  Count Occurrences
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA
Problem Description

Find number of occurrences of bob in the string A consisting of lowercase english alphabets.



Problem Constraints

1 <= |A| <= 1000


Input Format

The first and only argument contains the string A consisting of lowercase english alphabets.


Output Format

Return an integer containing the answer.


Example Input

Input 1:

  "abobc"
Input 2:

  "bobob"


Example Output

Output 1:

  1
Output 2:

  2


Example Explanation

Explanation 1:

  The only occurrence is at second position.
Explanation 2:

  Bob occures at first and third position.
* */

package com.company.DSAlgo;

public class CountOccurences {
    public int solve(String A) {
        int ans=0;
        int i=0;
        if(A.length()<3){
            return 0;
        }
        while(i<A.length()){
            if(A.charAt(i)=='b'){
                if(checkBob(A,i)){
                    ans++;
                }
            }
            i++;
        }
        return ans;
    }

    public boolean checkBob(String A,int i){
        if(i+1<A.length()&&A.charAt(i+1)=='o'){
            if(i+2<A.length()&&A.charAt(i+2)=='b'){
                return true;
            }
        }
        return false;
    }
}
