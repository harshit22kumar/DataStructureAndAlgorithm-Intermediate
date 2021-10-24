/*Little Ponny and Little Donny are playing a game. 
The game consists of a box containing A stones in the beginning.

A move consists of removing some stones from the box. Now,
 if the box contains K stones at the moment, then a player
  can pick up anywhere between 1 to K − 1 number of stones except
   if there is only one left in which case the player has no other choice but to pick it.
 The player who isn't able to make any move loses.

Guess the winner if Little Ponny moves first.*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>


using namespace std;

string solve(int A) {
    if(A==2){
        return "Donny";
    }else{
        return "Ponny";
    }
}

int main(){
   cout<<solve(5);
}