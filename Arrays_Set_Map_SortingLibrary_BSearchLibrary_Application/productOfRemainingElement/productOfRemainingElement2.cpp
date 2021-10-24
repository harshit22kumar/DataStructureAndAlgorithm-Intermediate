/**
 * Check if the array has an element which is equal to product of remaining elements
 * 
 * Given an array of N elements, the task is to check if the array has an element which
 * is equal to the product of all the remaining elements.
 */


#include<iostream>
#include<vector>
#include<algorithm>
#include<unordered_set>
#include<cmath>

using namespace std;

bool productOfremainingElement(vector<int> arr)
{
    int prod=1;
    sort(arr.begin(),arr.end(),greater<>());
        for(int i=1;i<arr.size();i++)
            prod=prod*arr[i];
    if(arr[0]==prod)
    return true;
    else
    return false;
}

int main() 
{ 
    vector<int> arr =  { 1, 2, 12, 3, 2 }; 
    if(productOfremainingElement(arr)==true) 
    cout<< "YES";
    else
    cout<<"NO";  
} 