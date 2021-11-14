/**
Given a non-negative integer N. The task is to check if N is a power of 2.
More formally, check if N can be expressed as 2x for some x.
Example 1:

Input: N = 1
Output: true
Explanation:
1 is equal to 2 raised to 0 (20 = 1).

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).
 * 
*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
#include<cmath>
#include<bitset>

using namespace std;

int main(){
    long long number=1099511627776;
    long long msb=(long long)log2(k);
    long long msbNumber=1ll<<msb;
    long long flag=number^msbNumber;
        if(flag!=0ll){
            cout<<false;
        }else{
            cout<<true;
        }
}