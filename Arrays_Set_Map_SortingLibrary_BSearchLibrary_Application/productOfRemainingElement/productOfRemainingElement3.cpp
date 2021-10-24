/**
 * Check if the array has an element which is equal to product of remaining elements
 * 
 * Given an array of N elements, the task is to check if the array has an element which
 * is equal to the product of all the remaining elements.
 */

/**
 * Method-2: The approach is to find the product of all the elements of the array and check
 *  if it is a perfect square or not. If it is a perfect square then check if the square root
 *  of the product exists in the array or not. If exists then print Yes else print No.

According to the problem statement, a * b = N
where b is the product of all the remaining elements of the array except a i.e arr[i]
And it is also mentioned that find the index such that a = b.
So, it simply means that a*a = N i.e. N is a perfect square. and a is its square root.
 */



#include<iostream>
#include<vector>
#include<algorithm>
#include<unordered_set>
#include<cmath>

using namespace std;

bool productOfremainingElement(vector<int> arr)
{
    int prod = 1; 
  
    // Storing frequency in map 
    unordered_set<int> freq; 
  
    // Calculate the product of all the elements 
    for (int i = 0; i < arr.size(); ++i) { 
        freq.insert(arr[i]); 
        prod *= arr[i]; 
    } 
      int root = sqrt(prod); 
  
    // If the prod is a perfect square 
    if (root * root == prod) 
  
        // then check if its square root 
        // exist in the array or not 
        if (freq.find(root) != freq.end()) 
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