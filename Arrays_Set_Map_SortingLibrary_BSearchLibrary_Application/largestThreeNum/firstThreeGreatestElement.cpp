/**
 * .Given	an	array	with	all	distinct	elements,	
find	the	largest	three	
    elements.	Expected	time	complexity	is	O(n)	and	extra	space	is	O(1).
 */

#include<iostream>
#include<vector>
#include<numeric>
#include<algorithm>
using namespace std;

void firstThreeGreatestNumber(vector<int> arr1);


int main()
{
    int siz1;
    cout<<"Enter the size of First array"<<endl;
    cin>>siz1;
    cout<<"Enter the element of First array"<<endl;
    vector<int> arr1(siz1,0);
    for(int i=0;i<arr1.size();i++)
    cin>>arr1[i];
    firstThreeGreatestNumber(arr1);
}

void firstThreeGreatestNumber(vector<int> arr1)
{
    vector<int> result;
    sort(arr1.begin(),arr1.end());
    result.push_back(arr1[arr1.size()-1]);
    result.push_back(arr1[arr1.size()-2]);
    result.push_back(arr1[arr1.size()-3]);
    for(int element:result)
        cout<<element<<"\t";
}