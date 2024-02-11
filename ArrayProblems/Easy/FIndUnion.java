package ArrayProblems.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class FIndUnion {

    public static void main(String[] args) {
        int a1[]  = {2,3,4,5,6,6,7,8};
        int a2[] = { 5,6,7,7,8,9};
        ArrayList<Integer> union = Union(a1,a2,a1.length, a2.length);
        for(int i : union){
            System.out.print(i+ " ");
        }
    }
    static ArrayList<Integer> Union(int a1[], int a2[], int n , int m){
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();
        for(int i = 0 ; i< n ; i++){
            s.add(a1[i]);
        }
        for(int j = 0; j< m ;j++){
            s.add(a2[j]);
        }
        for(int it: s){
            union.add(it);
        }
        return union;
    }
}