package com.vikkey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void merging(int[] nums, int l, int mid, int h) {
        int k  = 0;
        int i = l;
        int j = mid+1;
        int temp[] = new int[h - l + 1];

        while(i <= mid && j <= h ){
            if(nums[i] < nums[j]){
                temp[k++] = nums[i++];
            }
            else{
                temp[k++] = nums[j++];
            }
        }
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= h){
            temp[k++] = nums[j++];
        }
        k = 0;
        for(int p = l; p <= h; p++){
            nums[p] = temp[k++];
        }
    }
    public static void mergeSort(int[] nums, int l, int h){
        if(l < h){

        int mid = (l+h)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, h);
        merging(nums, l, mid, h);

        }

    }
    public static void main(String[] args) {
        int arr[]= {5,6,7,4,1,3,2,2};
        Main.mergeSort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
