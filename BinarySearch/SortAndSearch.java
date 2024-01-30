package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearch {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = sc.nextInt();
    int arr[]= new int[n];
    System.out.println("Enter elements of array: ");
    for (int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("Sorted array: " + Arrays.toString(arr));
    System.out.println("Enter the element to be searched: ");
    int k = sc.nextInt();
    int res = binarySearch(arr,k);
    sc.close();
    System.out.println("Element was found at : " + res);
}
private static int binarySearch(int arr[], int k){
    int l = 0;
    int r = arr.length - 1;
    while(l<=r){
        int mid = l + (r-l)/2;
        if(arr[mid]==k){
            return mid;
        }
        else if(arr[mid]<k){
            l = mid + 1;
        }
        else {
            r = mid -1;
        }
    }
    return -1;
}
    
}