/**Factorial of a larger number */

#include<iostream>
#include<vector>

using namespace std;

void factorial(int number);
void multiply(int num,vector<int>& result);

void factorial(int number)
{
    vector<int> result;
    result.push_back(1);
    for(int num=2;num<=number;num++)
    multiply(num,result);
    for(int element=result.size()-1;element>-1;element--)
    {
        cout<<result[element];
    }
}

void multiply(int num,vector<int>& result)
{
    int carry=0;
    for(int i=0;i<result.size();i++)
    {
        int prod=result[i]*num+carry;
        result[i]=prod%10;
        carry=prod/10;
    }
    while(carry)
    {
        result.push_back(carry%10);
        carry=carry/10;
    }
}
int main()
{
    int number;
    cout<<"Enter the number to calculate factorial"<<endl;
    cin>>number;
    factorial(number);
}