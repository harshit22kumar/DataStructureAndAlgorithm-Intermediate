/**Given an array of N elements,
 *  the task is to find all the unique pairs that can be formed 
 * using the elements of a given array. */



#include<iostream>
#include<vector>
#include<algorithm>
#include<unordered_set>
#include<cmath>

using namespace std;

int noOfUniquePairFormed(vector<int> arr);

int noOfUniquePairFormed(vector<int> arr)
{
    unordered_set<int> s;

    for(int e:arr)
    {
        s.insert(e);
    }
    return pow(s.size(),2);
}

int main()
{
    vector<int> arr={1,2,3}; 
    int pair= noOfUniquePairFormed(arr); 
            cout << "The noble integer is " << pair; 
}