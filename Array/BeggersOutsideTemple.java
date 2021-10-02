/**
 * Beggars Outside Temple
 * There are N (N > 0) beggars sitting in a row outside a temple.
 * Each beggar initially has an empty pot. When the devotees come to the temple,
 * they donate some amount of coins to these beggars. Each devotee gives a fixed
 * amount of coin(according to his faith and ability) to some K beggars sitting next to each other.
 *
 * Given the amount donated by each devotee to the beggars ranging from i to j index,
 * where 1 <= i <= j <= N, find out the final amount of money in each beggar's pot at
 * the end of the day, provided they don't fill their pots by any other means.
 *
 * Example:
 *
 * Input:
 * N = 5, D = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
 *
 * Return: [10, 55, 45, 25, 25]
 *
 * Explanation:
 * => First devotee donated 10 coins to beggars ranging from 1 to 2.
 * Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]
 *
 * => Second devotee donated 20 coins to beggars ranging from 2 to 3.
 * Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]
 *
 * => Third devotee donated 25 coins to beggars ranging from 2 to 5.
 * Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]
 *
 * */


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BeggersOutsideTemple {
    public static void main(String[] args) {
        //ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 10, 55, 45, 25, 25) );
        ArrayList<ArrayList<Integer>> matrix=new ArrayList <> ();
        ArrayList<Integer> list1=new ArrayList <> (Arrays.asList ( 1, 2, 10 ));
        ArrayList<Integer> list2=new ArrayList <> (Arrays.asList ( 2, 3, 20 ));
        ArrayList<Integer> list3=new ArrayList <> (Arrays.asList ( 2, 5, 25 ));
        matrix.add ( list1 );
        matrix.add ( list2 );
        matrix.add ( list3 );
        System.out.println ( solve(5,matrix).toString () );
    }
    public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> list=new ArrayList<>( Collections.nCopies(A, 0));
        Integer start,end,weight;
        for(ArrayList <Integer> r:B){
            weight=r.get(2);
            start=r.get(0)-1;
            list.set(start,list.get ( start )+weight);
            end=r.get(1);
            if(end<=list.size ()-1) {
                list.set ( end, list.get ( end ) - weight );
            }
        }
        for(int i=1;i<list.size();i++){
            list.set(i,list.get(i-1)+list.get(i));
        }
        return list;
    }
}
