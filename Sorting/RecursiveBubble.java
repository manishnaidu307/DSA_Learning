package Sorting;
public class RecursiveBubble {

    public static void main(String[] args) {
        int arr[] = {4,6,7,2,5,1};
        int n = arr.length;
        bubble_sort(arr,n);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void bubble_sort(int arr[],int n){
        if(n==1) return;
        for(int i = 0;i<=n-2;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubble_sort(arr,n-1);
    }
}