/**The Fibonacci sequence is defined as follows:the first number of sequence is 0
 * the second number is 1 and the nth number is sum of the (n-1)th and (n-2)th
 * numbers.Write a function that takes in an integer n and returns the nth fibinacci number.
 */

#include<iostream>
#include<unordered_map>
using namespace std;

int findNthFibonacciNumber(int n)
{
    unordered_map<int,int> memoize({{1,0},{2,1}});
    return helper(n,memoize);
}
int helper(int n,unordered_map<int,int> memoize)
{
    if(memoize.find(n)!=memoize.end())
    {
        return memoize[n];
    }else{
        memoize[n]=helper(n-1,memoize)+helper(n-2,memoize);
        return memoize[n];
    }
}
int main()
{
    int nposition;
    cout<<nposition<<endl;
    cout<<findNthFibonacciNumber(nposition);
}