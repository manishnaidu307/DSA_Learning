package Sorting;

import java.util.ArrayList;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {5,6,7,2,3,4};
        int n = arr.length;
        System.out.println("Before merge sort: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        merge_sort(arr,0,n-1);
        System.out.println("\nAfter merge sort: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    //Recursive function to divide and conquer the elements and merge
    private static void merge_sort(int arr[],int low, int high){
        if(low>=high){return;}
        int mid = (low+high)/2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    //Merge function to sort the divided sorted arrayy and merge them 
    private static void merge(int arr[],int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
}