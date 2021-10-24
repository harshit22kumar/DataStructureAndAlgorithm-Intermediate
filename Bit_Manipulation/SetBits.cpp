/**
Number of 1 Bits
Problem Description

Write a function that takes an integer and returns the number of 1 bits it has.
Input Format
First and only argument contains integer A

Example Input
Input1:
11
Example Output
Output1:
3
Example Explanation
Explaination1:
11 is represented as 1011 in binary.
 * 
*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
#include<cmath>
#include<bitset>


using namespace std;



class Solution{
    public:
     int singleNumber(int A) ;
};

//Alternate Brut-force approach is convert to binary and count the set char "1"

int Solution::numSetBits(int A) {
    int count=0;
    while(A>0){
       if(A&1==1){
           count++;
       } 
       A=A>>1;
    }
    return count;
}




int main(){
   Solution s;
   cout<<s.numSetBits(3);
}