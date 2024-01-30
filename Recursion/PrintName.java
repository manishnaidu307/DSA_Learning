package Recursion;

import java.util.Scanner;

class PrintName {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of times to print: ");
     int n = sc.nextInt();
     int i = 1;
     recursionfunc(i,n);
     sc.close();
    }
    private static void recursionfunc(int i , int n){
        if(i>n){return;}
        System.out.println("Manish");
        recursionfunc(i+1, n);
    }
    
}
