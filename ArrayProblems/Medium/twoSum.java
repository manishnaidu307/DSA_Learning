package ArrayProblems.Medium;

import java.util.Arrays;

public class twoSum {
    public static void main(String[]args){
        int arr[] = {2,3,6,3,2,1,7};
        int target = 8;
        boolean ans = TwoSum(arr, target);
        System.out.print(ans);
    }
    private static boolean TwoSum(int nums[], int k){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left<right){
            int sum = nums[left]+ nums[right];
            if(sum==k){
                return true;
            }
            else if(sum<k){
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }
}
