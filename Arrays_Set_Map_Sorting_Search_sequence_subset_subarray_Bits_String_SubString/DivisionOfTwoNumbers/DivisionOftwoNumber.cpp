/**
Integer Division of two number without using division operator
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
     int divide(long long dividend,long long divisor) ;
};

int Solution::divide(long long dividend,long long divisor){
   int sign = ((dividend < 0) ^
              (divisor < 0)) ? -1 : 1;

  dividend = abs(dividend);
  divisor = abs(divisor);

   // Initialize the quotient
  long long quotient = 0, temp = 0;

  // test down from the highest bit and
  // accumulate the tentative value for
  // valid bit
  for (int i = 31; i >= 0; --i) {
    if (temp + (divisor << i) <= dividend) {
      temp += divisor << i;
      quotient |= 1LL << i;
    }
  }
  //if the sign value computed earlier is -1 then negate the value of quotient
  if(sign==-1) quotient=-quotient;
   
  return quotient;
}

int main(){
    Solution s;
    int a = 10, b = 3;
    cout << s.divide(a, b) << "\n";
 
    a = 43, b = -8;
    cout << s.divide(a, b);
 
  return 0;
}