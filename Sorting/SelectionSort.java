package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {89,43,22,65,12,3};
        int n = arr.length;
        for(int i = 0; i<n-1;i++){
            int min = i;
            for(int j = i ; j<n;j++){
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("after selection sort: ");
        for(int i = 0 ;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
