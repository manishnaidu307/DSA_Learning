package Recursion;

import java.util.Scanner;

public class Nto1Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N number: ");
        int n = sc.nextInt();
        int i = n;
        recursionfunc(i, n );
        sc.close();
    }
    private static void recursionfunc(int i , int n){
        if(i<1){return;}
        System.out.println(i);
        recursionfunc(i-1, n);
    }
}
