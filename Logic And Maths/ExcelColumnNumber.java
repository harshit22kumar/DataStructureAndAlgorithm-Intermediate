/*
* Excel Column Number
Problem Description

Given a column title as appears in an Excel sheet, return its corresponding column number.



Problem Constraints
1 <= length of the column title <= 5



Input Format
Input a string which represents the column title in excel sheet.



Output Format
Return a single integer which represents the corresponding column number.



Example Input
Input 1:

 AB
Input 2:

 ABCD


Example Output
Output 1:

 28
Output 2:

 19010


Example Explanation
Explanation 1:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
* */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class ExcelColumnNumber {
    public static void main(String args[]){
        System.out.println ("ABCD");
    }
    public static int titleToNumber(String A) {
        int exp=0;
        int result=0;
        int power=1;
        for(int i=A.length()-1;i>=0;i--){
            result=result+(power*(A.charAt(i)-'A'+1));
            power=power*26;
        }
        return result;
    }
}
