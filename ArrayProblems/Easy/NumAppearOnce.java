package ArrayProblems.Easy;

public class NumAppearOnce {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4};
        int ans = GetNumAppearsOnce(arr, arr.length);
        System.out.println("The number that appears only once: " + ans);
    }
    public static int GetNumAppearsOnce(int arr[] , int n ){
        int xorr = 0;
        for(int i = 0;i<n;i++){
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
   
}
