package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {9,32,4,56,23};
        int n = a.length;
        bubble_sort(a,n);
    }
    static void bubble_sort(int a[], int n ){
        for(int i = n-1;i>=0;i--){
            for(int j = 0;j<=i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("after bubble sort:");
        for(int i = 0;i< n ;i++){
            System.out.print(a[i]+" ");
        }
    }
}
