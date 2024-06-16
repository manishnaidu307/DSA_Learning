package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,21,34,45};
        int n = arr.length;
        int x = 21;
        int ans = lowerbound(arr,n,x);
        System.out.println("Lower bound is: "+ ans);
    }

    private static int lowerbound(int[] arr, int n, int x) {
        int ans = n;
        int low = 0 , high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid - 1;
            } 
            else {
                low = mid + 1; 
            }
            

        }
        
        return ans;
    }
}
