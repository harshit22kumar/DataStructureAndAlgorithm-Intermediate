/**Given an	array of size n	and	a number k,	find all elements that appear more 
 * than n/k times */

 #include<iostream>
 #include<vector>
 #include<unordered_map>
 using namespace std;

 vector<int> findElement(vector<int> &array,int k);


  vector<int> findElement(vector<int> &array,int k)
  {
      unordered_map<int,int> um;
      vector<int> result;
      for(int element:array)
      um[element]++;
      //unordered_map<int,int>::iterator itr=um.begin();
      int limit=array.size()/k;
      for(auto itr=um.begin();itr!=um.end();itr++)
        if(itr->second>limit)
            result.push_back(itr->first);
        return result;
  }

 int main()
 {
     size_t siz;
     cout<<"Enter the size of the array"<<endl;
     cin>>siz;
     vector<int> arr(siz,0);
     for(int i=0;i<arr.size();i++)
     cin>>arr[i];
     int k;
     cout<<"Enter the value of k"<<endl;
     cin>>k;
     vector<int> result=findElement(arr,k);
        for(int element:result)
            cout<<element<<"\t";

 }