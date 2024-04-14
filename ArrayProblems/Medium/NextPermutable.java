package ArrayProblems.Medium;
public class NextPermutable {

    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
        nextPermu(arr);
        System.out.println("Next Permutable array: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void nextPermu(int [] a){
        int ind = -1;
        for(int i = a.length - 2; i>=0 ; i--){
            if(a[i]<a[i+1]){
                ind = i ;
                break;
            }
        }
        if(ind == -1){
            reverse(a,0,a.length-1);
        }
        for(int i = a.length-1;i>ind;i--){
            if(a[i]>a[ind]){
                int tem = a[i];
                a[i] = a[ind];
                a[ind] = tem;
                break;
            }
        }
        reverse(a,ind+1,a.length-1);
    }
    public static void reverse(int arr[], int start, int end){
        while(start<end){
            int tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;
            start++;
            end--;
        }
    }
}