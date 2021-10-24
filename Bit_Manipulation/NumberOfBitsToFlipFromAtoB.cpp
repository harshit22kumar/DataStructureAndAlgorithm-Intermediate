/**
You are given two numbers A and B. 
The task is to count the number of bits needed to be flipped to convert A to B.
 
 Input: A = 10, B = 20
Output: 4
Explanation:
A  = 01010
B  = 10100
As we can see, the bits of A that need 
to be flipped are 01010. If we flip 
these bits, we get 10100, which is B.
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
     int solve(int a,int b) ;
};

int Solution::solve(int a,int b){
        int ans=a^b;
        int count=0;
        while(ans>0){
            if(ans&1==1){
                 count++;
            }
            ans=ans>>1;
        }
    return count;
}

int main(){
    Solution s;
    cout<<s.solve(10,20);
}