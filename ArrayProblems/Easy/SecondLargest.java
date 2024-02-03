package ArrayProblems.Easy;

public class SecondLargest {
    //To Find the second largest and second smallest number in an array.
    public static void main(String[] args) {
        int arr[] = {4,2,3,5,9};
        int n = arr.length;
        int sSmallest = SecondSmallest(arr, n);
        int sLargest = secondLargest(arr,n);
        System.out.println("Second Smallest Number: "+ sSmallest);
        System.out.println("Second Largest Number: "+ sLargest);
    }
    private static int secondLargest(int arr[], int n){
        int large = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>large){
                slarge = large;
                large = arr[i];
            }
            else if(arr[i]>slarge && arr[i]!= large){
                slarge = arr[i];
            }
        }
        return slarge;
    }
    private static int SecondSmallest(int arr[], int n ){
        int small = Integer.MAX_VALUE;
        int sSmall = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]< small){
                sSmall = small;
                small = arr[i];
            }
            else if(arr[i]<sSmall && arr[i]!= small){
                sSmall = arr[i];
            }
        }
        return sSmall;
    }
}
