/*
 *
 * Spiral Order Matrix II
Problem Description

Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.



Problem Constraints
1 <= A <= 1000



Input Format
First and only argument is integer A


Output Format
Return a 2-D matrix which consists of the elements in spiral order.



Example Input
Input 1:

1
Input 2:

2


Example Output
Output 1:

[ [1] ]
Output 2:

[ [1, 2], [4, 3] ]


Example Explanation
Explanation 1:


Only 1 is to be arranged.
Explanation 2:

1 --> 2
      |
      |
4<--- 3
 *
 * */


package com.company.DSAlgo;

import java.util.ArrayList;

public class SpiralPrinting {
    public static void main(String []args) {
       for(ArrayList<Integer> list:generateMatrix(5)){
           System.out.println (list.toString ());
       }
    }
    public static ArrayList< ArrayList <Integer> > generateMatrix(int A) {
        int M=A,N=A; //A=5
        int i=0,j=0;
        int number=1;
        int [][]spiral=new int[N][M];
        ArrayList<ArrayList<Integer>> spiralMatrix = new ArrayList <> ();
        while(N>1&&M>1){
            for(int k=0;k<M-1;k++){
                spiral[i][j]=number++;
                j++;//0,1,2,3,4
            }
            for(int k=0;k<N-1;k++){
                spiral[i][j]=number++;
                i++;//0,1,2,3,4
            }
            for(int k=0;k<M-1;k++){
                spiral[i][j]=number++;
                j--;//4,3,2,1,0
            }
            for(int k=0;k<N-1;k++){
                spiral[i][j]=number++;
                i--;//4,3,2,1,0
            }
            N=N-2;M=M-2;
            i++;j++;
            if(N==0||M==0){
                break;
            }
        }
        /*Border case*/
        if(N==1||M==1){
            if(N>1){
                for(int k=0;k<N;k++){
                    spiral[i][j]=number++;
                    i++;
                }
            }else{
                for(int k=0;k<M;k++){
                    spiral[i][j]=number++;
                    j++;
                }
            }
        }
        for (int[] ints : spiral) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int ele : ints) {
                list.add(ele);
            }
            spiralMatrix.add(list);
        }
        return spiralMatrix;
    }
}
