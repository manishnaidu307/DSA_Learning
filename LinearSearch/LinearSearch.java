package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of arrayy: " );
        int arr[] = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int k = sc.nextInt();
        int res = linearSearch(arr, k);
        sc.close();
        System.out.println("Element was found at : "+ res);
    }
    private static int linearSearch(int arr[], int k){
        for ( int i = 0 ; i < arr.length ; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
