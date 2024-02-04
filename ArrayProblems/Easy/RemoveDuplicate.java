package ArrayProblems.Easy;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,3,3,4,4,4};
        int n = arr.length;
        int k = removeDup(arr,n);
        System.out.println("array after removing duplicates: \n");
        for(int i = 0;i<k;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    private static int removeDup(int arr[], int n ){
        int i = 0; 
        for (int j = 1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
