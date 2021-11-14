/**Find the largest of three number in an array */
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

vector<int> largestOfThreeNumber(vector<int> &array);

int main()
{
    int siz;
    cout<<"Enter the size of array"<<endl;
    cin>>siz;
    vector<int> array(siz,0);
    cout<<"Enter the array element"<<endl;
    for(int i=0;i<array.size();i++)
    cin>>array[i];
    vector<int> largestThreeElement;
    largestThreeElement=largestOfThreeNumber(array);
    for(int element:largestThreeElement)
    {
        cout<<element<<" ";
    }
}

vector<int> largestOfThreeNumber(vector<int> &array)
{
    vector<int> largestThreeElement;
    sort(array.begin(),array.end(),greater<int>());
    largestThreeElement.push_back(array[0]);
    largestThreeElement.push_back(array[1]);
    largestThreeElement.push_back(array[2]);
    return largestThreeElement;
}