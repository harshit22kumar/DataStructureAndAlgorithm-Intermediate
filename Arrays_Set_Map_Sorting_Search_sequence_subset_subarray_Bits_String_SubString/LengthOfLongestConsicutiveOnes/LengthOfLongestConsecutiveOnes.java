package com.company.DSAlgo;

public class LengthOfLongestConsecutiveOnes {
    public static void main(String args[]){
       System.out.println (solve("111011101"));
        System.out.println (solve("011011110"));
       System.out.println (solve("11110000"));
       System.out.println (solve("0001111"));
        System.out.println (solve("1101001100101110"));
       System.out.println (solve("0000000000"));
       System.out.println (solve("11111111111"));
        System.out.println (solve("0111001101110"));
    }

    public static int solve(String A) {
        int total_one=0;
        for(int i=0;i<A.length ();i++){
            if(A.charAt ( i )=='1') {
                total_one++;
            }
        }
       boolean left_count_enabled=true;
       int left_one=0;
       int right_one=0;
       int max_curr=0;
       for(int i=0;i<A.length ();i++){
           if(A.charAt ( i )=='1'){
               if(left_count_enabled){
                   left_one++;
               }else{
                   right_one++;
               }
           }else{
               if(left_count_enabled){
                   left_count_enabled=false;
               }else {
                   max_curr = Math.max ( max_curr, getLatestMax ( left_one, right_one, total_one ) );
                   left_one = right_one;
                   right_one = 0;
               }
           }
       }
        max_curr=Math.max (max_curr,getLatestMax(left_one,right_one,total_one));
        return max_curr;
    }

    public static int getLatestMax(int left_one,int right_one,int total_one){
        if(left_one+right_one+1>total_one){
            return left_one+right_one;
        }else{
            return left_one+right_one+1;
        }
    }
}
