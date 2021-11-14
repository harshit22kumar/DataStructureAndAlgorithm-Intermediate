/**
 * Rotation Game
 * Problem Description
 *
 * You are given an integer array A and an integer B. You have to print the same
 * array after rotating it B times
 * towards right.
 *
 * NOTE: You can use extra memory.
 *
 *Input Format
 * First line begins with an integer |A| denoting the length of array, and then
 * |A| integers denote the array elements.
 * Second line contains a single integer B
 *

 * Output Format
 * Print an array of integers which is the Bth right rotation of input array A, on a separate line.
 *
 *
 * Example Input
 * Input 1:
 *
 *  4 1 2 3 4
 *  2
 * Input 2:
 *
 *  3 1 2 2
 *  3
 *
 *
 * Example Output
 * Output 1:
 *
 *  3 4 1 2
 * Output 2:
 *
 *  1 2 2
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  [1,2,3,4] => [4,1,2,3] => [3,4,1,2]
 *
 * Explanation 2:
 *
 *
 *  [1,2,2] => [2,1,2] => [2,2,1] => [1,2,2]
 * */


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RotatedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size=in.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        int[] rotatedArray=new int[size];
        int rotate=in.nextInt();
        rotate%=size;
        int indexOfRotatedArray=0;
        int i;
        for(i=size-rotate;i<size;i++){
            rotatedArray[indexOfRotatedArray]=arr[i];
            indexOfRotatedArray++;
        }
        for(i=i%size;i<size-rotate;i++){
            rotatedArray[indexOfRotatedArray]=arr[i];
            indexOfRotatedArray++;
        }
        for(i=0;i<rotatedArray.length;i++){
            System.out.print(rotatedArray[i]+" ");
        }
    }
}
