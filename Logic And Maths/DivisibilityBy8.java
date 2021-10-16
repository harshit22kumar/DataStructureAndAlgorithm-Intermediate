/*
* Divisibility by 8
Given a number A in the form of string. Check if the number is divisible by 8 or not.

Return 1 if it is divisible by 8 else return 0.


Input Format

The only argument given is string A.
Output Format

Return 1 if it is divisible by 8 else return 0.

Constraints

1 <= length of the String <= 100000
'0' <= A[i] <= '9'
For Example

Input 1:
    A = "16"
Output 1:
    1

Input 2:
    A = "123"
Output 2:
    0
* */

package com.company.DSAlgo;

public class DivisibilityBy8 {
    public static void main(String[] args){

        System.out.println (solve("16"));
    }
    public static int solve(String A) {
        int i=A.length()-1;
        int power=1;
        long rem=((A.charAt(i)-48)*power)%8;
        i--;
        int ans;
        while(i>=0){
            power=(power*(10%8))%8;
            rem=(rem+((long) (A.charAt ( i ) - 48) *power)%8)%8;
            i--;
        }
        if(rem==0){
            ans=1;
        }else{
            ans=0;
        }
        return ans;
    }


}
