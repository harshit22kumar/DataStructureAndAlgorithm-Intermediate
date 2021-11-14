/*write a function that takes in an array of integers and returns a sorted 
array of the three largest integer in an input array.
Note that the function should return duplicate integers if necessary
for example it should return [10,10,12] for an input array[10,5,9,10,12]
 */
//sample input:[141,1,17,-7,-17,-27,18,541,8,7,7]
//sample output:[18,141,541]
#include<vector>
#include<climits>

using namespace std;

vector<int> findThreeLargestNumber(vector<int> array);
void updateLargest(vector<int>* threeLargest,int num);
void shiftAndUpdate(vector<int>* largest,int num,int idx);

//O(n) time | O(1) space

vector<int> findThreeLargestNumbers(vector<int> array){
    vector<int> threeLargest {INT_MIN,INT_MIN,INT_MIN};
    for(int num:array){
        updateLargest(&threeLargest,num);
    }
    return threeLargest;
}

void updateLargest(vector<int>* threeLargest,int num){
    if(num>threeLargest->at(2)){
        shiftAndUpdate(threeLargest,num,2);
    }else if(num>threeLargest->at(1)){
        shiftAndUpdate(threeLargest,num,1);
    }else if(num>threeLargest->at(0)){
        shiftAndUpdate(threeLargest,num,0);
    }
}

void shiftAndUpdate(vector<int>* array,int num,int idx){
    for(int i=0;i<=idx;i++){
        if(i==idx){
        array->at(i)=num;
   } else {
       array->at(i)=array->at(i+1);
    }
}
}