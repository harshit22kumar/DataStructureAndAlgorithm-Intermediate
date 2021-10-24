/**Count of pairs between two arrays such that the sums are distinct */

#include<iostream>
#include<unordered_set>
#include<vector>

using namespace std;

int findUniquePairSum(vector<int> arr1,vector<int> arr2)
{
     int cnt = 0; 
  
    // Set to store the sum 
    // obtained for each pair 
    unordered_set<int> s; 
  
    for (int i = 0; i < arr1.size(); i++) { 
        for (int j = 0; j < arr2.size(); j++) { 
  
            // Sum of the current pair 
            int sum = arr1[i] + arr2[j]; 
  
            // If the sum obtained is distinct 
            if (s.count(sum) == 0) { 
  
                // Increment the count 
                cnt++; 
  
                // Insert sum in the set 
                s.insert(sum); 
            } 
        } 
    } 
  
    return cnt; 
}

int main()
{
    
    int siz;
    cout<<"Enter the size of the array"<<endl;
    cin>>siz;
    vector<int> arr1(siz,0);
    vector<int> arr2(siz,0);
    cout<<"Enter the array element"<<endl;
    for(int i=0;i<arr1.size();i++)
    cin>>arr1[i];
    for(int i=0;i<arr2.size();i++)
    cin>>arr2[i];
    cout<<"unique sum is  "<<findUniquePairSum(arr1,arr2);
}
