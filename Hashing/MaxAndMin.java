package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MaxAndMin {
    public static void main(String[] args) {
        int arr[] = {5,10,5,15,10,5};
        int n = arr.length;
        frequency(arr,n);
    }
    static void frequency(int arr[],int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n ;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();
            if(count>maxFreq){
                maxEle = element;
                maxFreq = count;
            }
            else if(count<minFreq){
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("Max Frequency: "+ maxEle + " " + maxFreq);
        System.out.println("Min Frequency: "+ minEle + " "+ minFreq);
    }
    

}
