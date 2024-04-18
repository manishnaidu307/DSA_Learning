package ArrayProblems.Medium;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWIthSumK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
        int ans = FindSubArrayWithSumK(arr,k);
        System.out.println("Number of subarrays with k: "+ ans);
    }
    private static int FindSubArrayWithSumK(int nums[] , int k){
        int preSum = 0, cnt = 0;
        Map<Integer,Integer>mpp = new HashMap<>();
        mpp.put(0,1);
        for(int i = 0; i<nums.length;i++){
            preSum += nums[i];
            int remove = preSum - k;
            cnt += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0)+1);
        }
        return cnt;
    }
}
