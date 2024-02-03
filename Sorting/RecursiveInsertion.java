package Sorting;

public class RecursiveInsertion {
    public static void main(String[] args) {
        int arr[] = {5,4,2,6,7,1};
        int n = arr.length;
        insertion_sort(arr,0,n);
        System.out.println("After recursive insertion sort: \n");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void insertion_sort(int arr[], int i , int n){
        if(i == n) return ;
        int j = i;
        while (j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertion_sort(arr,i+1,n);
    }
}
