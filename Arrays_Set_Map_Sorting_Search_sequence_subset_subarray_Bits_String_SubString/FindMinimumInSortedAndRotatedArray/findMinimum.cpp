/**Find the minimum element in a sorted and rotated array */

#include<vector>
#include<iostream>

using namespace std;

int findMinium(vector<int>&);

int findMinium(vector<int> &array,int low,int high)
{
    int mid=(low+high)/2;
    if(low==high)
    {
        return array[low];
    } 
    if (array[mid-1]>array[mid]&&mid>low)
    {
        return array[mid];
    } 
    if(array[mid+1]<array[mid]&&mid<high)
    {
        return array[mid+1];
    }
    if(arr[high]>array[mid])
    findMinium(array,low,mid-1);
    findMinium(array,mid+1,high);
}

int main()
{
  
    size_t siz;
    cout<<"Enter the size of array"<<endl;
    cin>>siz;
    vector<int> array(0,siz0);
    cout<<"Enter the array element"<<endl;
    for(int i=0;i<array.size();i++)
    cin>>array[i];
    findMinium(array,0,array.size()-1);
}

