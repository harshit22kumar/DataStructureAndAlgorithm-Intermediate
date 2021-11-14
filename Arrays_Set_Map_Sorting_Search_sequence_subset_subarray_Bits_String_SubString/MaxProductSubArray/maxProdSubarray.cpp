/**Find the maximum product in an array */

#include<iostream>
#include<vector>


int maxProdSubArray(std::vector<int> &);

int maxProdSubArray(std::vector<int> &arr)
{
    int max_prod=INT_MIN;
    int productUptoHere=1;
    for(int i=0;i<arr.size();i++)
    {
        if(arr[i]!=0)
        {
            productUptoHere=productUptoHere*arr[i];
            max_prod=std::max(productUptoHere,max_prod);
        }else
        {
            productUptoHere=1;
            continue;
        }  
    }
    return max_prod;
}

int main()
{
    size_t siz;
    std::cout<<"Enter the size of array\t";
    std::cin>>siz;
    std::vector<int> arr(siz,0);
    std::cout<<"Enter the array element";
    for(int i=0;i<arr.size();i++)
    std::cin>>arr[i];
    std::cout<<maxProdSubArray(arr);
}