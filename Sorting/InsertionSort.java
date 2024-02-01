package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {24,53,2,3,9};
        int n = a.length;
        insertion_sort(a, n);
    }
    static void insertion_sort(int a[], int n){
        for(int i = 0;i<n ;i++){
            int j = i;
            while(j>0 && a[j-1]>a[j]){
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j]= temp;
                j--;
            }
        }
        System.out.println("after insertion sort: ");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
