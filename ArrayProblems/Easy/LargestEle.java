package ArrayProblems.Easy;

public class LargestEle {
    public static void main(String[] args) {
        int arr1[] = {3,5,6,7,2,1};
        int arr2[] = {6,3,2,5,4,1};
        System.out.println("Largest number in array1: "+ LargestElement(arr1));
        System.out.println("Largest number in array2: "+ LargestElement(arr2));
    }
    static int LargestElement(int arr[]){
        int max = arr[0];
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
