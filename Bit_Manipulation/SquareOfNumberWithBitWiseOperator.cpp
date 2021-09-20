/**
Calculate square of a number without using *, / and pow()
by using bitwise operator
 square(n) = 0 if n == 0
  if n is even 
     square(n) = 4*square(n/2) 
  if n is odd
     square(n) = 4*square(floor(n/2)) + 4*floor(n/2) + 1 

Examples
  square(6) = 4*square(3)
  square(3) = 4*(square(1)) + 4*1 + 1 = 9
  square(7) = 4*square(3) + 4*3 + 1 = 4*9 + 4*3 + 1 = 49
How does this work? 

If n is even, it can be written as
  n = 2*x 
  n2 = (2*x)2 = 4*x2
If n is odd, it can be written as 
  n = 2*x + 1
  n2 = (2*x + 1)2 = 4*x2 + 4*x + 1
floor(n/2) can be calculated using a bitwise right shift operator. 2*x and 4*x can be calculated 
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
     int square(int a) ;
};

int Solution::square(int num){
    if(num<0){
        num=-num;
    }
    if(num==0){
        return 0;
    } 
    //flore of num/2
    int x=num>>1;
    //this check if num is odd.
    //using right shift will give = 2^n * num (where n is shift)
    if(num&1==1){
        return ((square(x) << 2) + (x << 2) + 1);
    }else {
        return (square(x) << 2);
    }
}

int main(){
    Solution s;
    cout<<s.square(9);
}