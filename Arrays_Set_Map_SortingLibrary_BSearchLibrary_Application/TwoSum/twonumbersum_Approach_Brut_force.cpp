/*Write a function that takes in non-empty array of distict integer and an integer representing a target sum.
If any two numbers in input array sum to target sum,the function should return them in an array,in sorted order.If 
no two numbers sum up to the target sum,the function should return an empty array.Assume that there will be at 
most one pair of number summing up to target sum.

Sample Input :[3,5,-4,8,11,1,-1,6],10
Sample Output:[-1,11]

 */
#include<vector>
using namespace std;

//O(n^2) | O(1) space

vector <int > twoNumberSum(vector<int> array,int targetsum){
    for (int i=0;i<array.size()-1;i++){
        int firstNum = array[i];
        for(int j=i+1;j<array.size();j++){
            int secondNum = array[j];
            if(firstNum+secondNum == targetsum){
                return firstNum>secondNum?vector<int> {secondNum,firstNum}:vector<int> {firstNum,secondNum};
            }
        }
    }
    return {};
}