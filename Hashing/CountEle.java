package Hashing;

import java.util.Scanner;

public class CountEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter queries");
        int q = sc.nextInt();
        int n = 5;
        int arr[]= {4,5,3,1,5};

        int hash[]  = new int[13];
        for (int i = 0;i<n;i++){
            hash[arr[i]] += 1;
        }
        System.out.println("Enter number to be counted");
        
        while(q-- != 0){
            int number = sc.nextInt();
            System.out.println("Count: "+hash[number]);
        }
        
        sc.close();

    }
}
