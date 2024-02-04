package ArrayProblems.Easy;

public class LeftRotatearr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        System.out.println("Array after left rotation: \n");
        leftRotate(arr,n);
    }
    private static void leftRotate(int arr[], int n){
        int temp = arr[0];
        for(int i = 1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
