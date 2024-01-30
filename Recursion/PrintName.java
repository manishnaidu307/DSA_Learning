package Recursion;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to be printed: ");
        int n = sc.nextInt();
        System.out.println("Enter your name:");
        String name = sc.next();
        int i = 1;
        recursionName(name, n , i );
        sc.close();
    }
    private static void recursionName(String name, int n , int i ){
        if(i>n){
            return;
        }
        System.out.println(name);
        recursionName(name, n, i+1);

    }
}
