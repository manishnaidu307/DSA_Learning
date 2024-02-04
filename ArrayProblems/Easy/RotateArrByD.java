package ArrayProblems.Easy;

//To rotate an arr by D number.

public class RotateArrByD {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 3;
        rotateArray(arr,n , d);
        System.out.println("after rotation array d times: \n");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void rotateArray(int arr[], int n , int d){

        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-1);
    }
    private static void reverse(int arr[], int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
