/**You aare given 2D Array(matrix) of distinct integer where each row is sorted and each column is sorted.The matrix 
 * does not necessarily have the same height and width.You are given a target number,and you must write a function 
 * an array of column and row indices of the target number if it contained in it and [-1,1] if not contained in it.
 */

#include<vector>
using namespace std;

//O(n) time | O(1) space

vector<int> searchInSortedMatrix(vector<vector<int>> matrix,int target)
{
    int row=0;
    int col=matrix[0].size()-1;
    while(row<matrix.size()&&col>=0)
    {
        if(matrix[row][col]<target)
        {
            col--;
        }
        else if(matrix[row][col]<target)
        {
            row++;
        }
        else
        {
            return {row,col};
        }
    }
    return {-1,1};
}
