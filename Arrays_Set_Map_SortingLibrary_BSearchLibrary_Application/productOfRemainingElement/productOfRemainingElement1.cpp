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
    for(int e:arr)
        prod=prod*e;
    for(int e:arr)
    if(e==prod/e)
        return true;
    
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