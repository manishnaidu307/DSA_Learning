package ArrayProblems.Medium;

public class Sortarray012 {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,2,2,1,1,1,0,0,0,2};
        sortArray(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    private static int[] sortArray(int nums[]){
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
    }
}
