/**
 * Single Number
Problem Description

Given an array of integers A, every element appears twice except for one. 
Find that single one.

Your algorithm should have a linear runtime complexity.
Could you implement it without using extra memory?

Example Input
Input 1:

 A = [1, 2, 2, 3, 1]

 Example Output
Output 1:

 3

 Example Explanation
Explanation 1:

3 occurs once.
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
     int singleNumber(const vector<int> &A) ;
};


int Solution::singleNumber(const vector<int> &A) {
     int nonRepetativeElement;
    nonRepetativeElement=A[0];
    for(int i=1;i<A.size();i++){
        nonRepetativeElement=nonRepetativeElement^A[i];
    }
    return nonRepetativeElement;
}




int main(){
   Solution s;
   vector<int> A{1, 2, 2, 3, 1};
   cout<<s.singleNumber(A);
}