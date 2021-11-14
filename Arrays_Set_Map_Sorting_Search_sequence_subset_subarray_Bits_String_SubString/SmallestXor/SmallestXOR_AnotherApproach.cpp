/**
Smallest XOR
Problem Description

Given two integers A and B, find a number X such that A xor X is 
minimum possible, and the number of set bits in X equals B.

Input Format
First argument contains a single integer A. Second argument
 contains a single integer B.



Output Format
Return a single integer X.



Example Input
Input 1:

 A = 3
 B = 3

 Input 2:

 A = 15
 B = 2

 Example Output
Output 1:

 7
Output 2:

 12


Example Explanation
Explanation 1:

 3 xor 7 = 4 which is minimum
Explanation 2:

 15 xor 12 = 3 which is minimum
*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
#include<cmath>

#include<bitset>


using namespace std;

#include<bitset>



class Utility{
    public:
    int stringToInt(string &s);
    string intToBinString(int X);
    int set(int X,int count);
    int reset(int X,int count);
};
int Utility::stringToInt(string &s){
   int num=0;
   int pos=0;
   for(int i=s.size()-1;i>=0;i--){
       num=num+((s[pos]-48)*(pow(2,i)));
       pos++;
   }
   return num;
}

string Utility::intToBinString(int X){
    string s=bitset<32>(X).to_string();
    // const auto loc=s.find('1');
    // if(loc!=string::npos){
    //     s=s.substr(loc);
    // } 
    return s;
}

int Utility::set(int X,int count){
    string s=intToBinString(X);
    for(int i=s.size()-1;i>=0;i--){
        if(s[i]=='0'&&count>0){
            s[i]='1';
            count--;
            if(count==0){
                break;
            }
        }
    }
    return stringToInt(s);
}

int Utility::reset(int X,int count){
    string s=intToBinString(X);
    for(int i=s.size()-1;i>=0;i--){
        if(s[i]=='1'&&count>0){
            s[i]='0';
            count--;
        }
        if(count==0){
                break;
        }
    }
    return stringToInt(s);
}

class Solution{
    public:
      int solve(int A, int B); 
};
int Solution::solve(int A, int B) {
    Utility u;
    int N=A;
    int X=A;
    int countSetBit=0;
    while(N>0){
        if(N&1==1){
           countSetBit++; 
        }
        N=N>>1;
    }
    if(countSetBit==B){
        return X;
    }
    else if(countSetBit>B){
        X=u.reset(X,countSetBit-B);
    }
    else if(countSetBit<B){
        X=u.set(X,B-countSetBit);
    }
    return X;
}




int main(){
   Solution s;
   cout<<s.solve(4,6);
}