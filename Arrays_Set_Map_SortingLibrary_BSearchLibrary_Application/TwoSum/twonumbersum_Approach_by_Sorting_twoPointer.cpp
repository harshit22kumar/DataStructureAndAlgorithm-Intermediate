/*Write a function that takes in non-empty array of distict integer and an integer representing a target sum.
If any two numbers in input array sum to target sum,the function should return them in an array,in sorted order.If 
no two numbers sum up to the target sum,the function should return an empty array.Assume that there will be at 
most one pair of number summing up to target sum.

Sample Input :[3,5,-4,8,11,1,-1,6],10
Sample Output:[-1,11]

 */
#include <vector>
#include<algorithm>
using namespace std;

//(O(nlog(n)))|O(1) space

vector <int> twoNumSum(vector<int> array,int targetSum){
    sort(array.begin(),array.end());
    int left = 0;
    int right=array.size()-1;
    while(left<right){
        int currentSum=array[left]+array[right];
        if(currentSum==targetSum){
            return {array[left],array[right]};
        }else if(currentSum<targetSum){
            left++;
        }else if(currentSum>targetSum){
            right--;
        }
    }
    return {};
}