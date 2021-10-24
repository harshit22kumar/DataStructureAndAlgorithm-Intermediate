/**
 * Given N strings of equal lengths. The strings contain only digits (1 to 9).
 * The task is to count the number of strings that have an index position such
 *  that the digit at this index position is greater than the digits at same index
 *  position of all the other strings.
 */

// C++ implementation of the approach 
#include <bits/stdc++.h> 
using namespace std; 

int countStrings(int arrSize,int stringSize,vector<string> strarr)
{
    unordered_set<string> ind;
    for(int i=0;i<stringSize;i++)
    {
        int mx=INT_MIN;
        for(int j=0;j<arrSize;i++)
        mx=max(mx,((int)str[j][i]-'0'));

        for(int i=0;i<arrSize;i++)
            if(s[i][j]-'0'==mx)
            ind.insert(i);
    }
    return ind.size();
}
  




// Driver code 
int main() 
{ 
    vector<string> str = { "223", "232", "112" }; 
    int m = str[0].length(); 
    int n = str.size()
    cout << countStrings(n, m, s); 
} 