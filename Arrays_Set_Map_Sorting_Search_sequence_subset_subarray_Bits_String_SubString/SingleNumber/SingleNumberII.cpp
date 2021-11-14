/**
Single Number III
Problem Description

Given an array of numbers A , in which exactly two elements appear only once and all the other elements
appear exactly twice. Find the two elements that appear only once.

Note: Output array must be sorted.


 * Example Input
Input 1:

A = [1, 2, 3, 1, 2, 4]
Example Output
Output 1:

[3, 4]

Example Explanation
Explanation 1:

 3 and 4 appear only once.
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
     vector<int> solve(vector<int> &A) ;
};

int checkbit(int N,int i){
    return (N>>i&1);
}

vector<int> Solution::solve(vector<int> &A) {
    int num=0;
    for(int i=0;i<A.size();i++){
        num=num^A[i];
    }
    int pos=0;
    for(int i=0;i<31;i++){
        if(checkbit(num,i)){
            pos=i;
            break;
        }  
    }
    int set=0,unset=0;
    for(int i=0;i<A.size();i++){
        if(checkbit(A[i],pos)){
            set=set^A[i];
        }
        else{
            unset=unset^A[i];
        }
    }
    vector<int> ans;
    if(set>unset){
        ans.push_back(unset);
        ans.push_back(set);
    }
    else{
       ans.push_back(set);  
       ans.push_back(unset);
    }
    return ans;
}




int main(){
   Solution s;
   vector<int> A{1, 2, 3, 1, 2, 4};
   vector<int> ans=s.solve(A);
   for(int ele:ans){
       cout<<ele<<" ";
   }
}