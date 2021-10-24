/**
Add Binary Strings
Problem Description

Given two binary strings, return their sum (also a binary string).
Example:

a = "100"

b = "11"
Return a + b = "111"
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
     string addBinary(string A, string B) ;
};

string Solution::addBinary(string A, string B) {
    if(A.size()>B.size()){
        B.insert(B.begin(),A.size()-B.size(),'0');
    }else if(B.size()>A.size()){
        A.insert(A.begin(),B.size()-A.size(),'0');
    }
    string sum="";
    int i=A.size()-1;
    int carry=0;
    while(i>=0){
        int bit1=A[i]-48;
        int bit2=B[i]-48;
        sum=to_string(((bit1)+(bit2)+carry)%2)+sum;
        carry=(bit1+bit2+carry)/2;
        i--;
    }
    if(carry!=0){
       sum=to_string(carry)+sum; 
    }
    return sum;
}



int main(){
   Solution s;
   cout<<s.addBinary("100","11");
}