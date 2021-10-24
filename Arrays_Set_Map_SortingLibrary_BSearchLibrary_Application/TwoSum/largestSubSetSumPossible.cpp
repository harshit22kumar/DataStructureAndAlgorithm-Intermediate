/**Largest sub-set possible for an array satisfying the given condition */
/**
 * Given an array arr[] and an integer K. The task is to find the size of the maximum 
 * sub-set such that every pair from the sub-set (X, Y) is of the form Y != (X * K) where X < Y.
 */


#include<iostream>
#include<vector>
#include<algorithm>
#include<unordered_set>
#include<cmath>

using namespace std;


int sizeSubSet(arr, k);

int sizeSubSet(vector<int> arr,k)
{
    unordered_set<int> subset;

    for(e:arr)
    {
        if(e%k!=0||subset.count(e/k)==0)
        subset.insert(e);
    }
    return subset.size();
}



// Driver code 
int main() 
{ 
    vector<int> arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };  
    int k = 2; 
    cout << sizeSubSet(arr, k); 
    return 0; 
} 