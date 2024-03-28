package ArrayProblems.Easy;
public class MaxConsecutiveOne {

    public static int ConsecutiveNumbers(int arr[], int n){
        int maxi = 0;
        int cnt = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==1){
                cnt++;
                maxi = Math.max(maxi, cnt);
            }
            else {
                cnt = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1,0};
        int ans = ConsecutiveNumbers(arr, arr.length);
        System.out.println("Maximum consecutive one: " + ans);
    }
}