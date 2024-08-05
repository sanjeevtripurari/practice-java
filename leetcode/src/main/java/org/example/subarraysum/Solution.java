package org.example.subarraysum;

import java.util.ArrayList;

public class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s){

        int sum=0;
        int l=0;
        int r=0;

        ArrayList<Integer> res=new ArrayList<>();

        while(r<n){
            sum += arr[r];

            while (l<r && sum>s){
                sum-=arr[l];
                l++;
            }

            if (sum==s){
                res.add(l+1);
                res.add(r+1);
                return(res);
            }
            r++;
        }
        res.add(-1);
        return (res);
    }
}
