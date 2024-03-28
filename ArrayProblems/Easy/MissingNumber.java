package ArrayProblems.Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        int ans = getMissingNumber(arr,arr.length);
        System.out.println("Missing Number: "+ ans);
    }
    public static int getMissingNumber(int arr[], int N){
        int sum = (N * (N+1)/2);
        int sum2 = 0;
        for(int i = 0; i<N-1; i++){
            sum2+= arr[i];
        }
        return sum-sum2;
    }
    
}