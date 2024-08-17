package Heaps;

import java.util.Iterator;
import java.util.PriorityQueue;

public class minHeapPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(40);
        pq.add(20);
        pq.add(60);
        pq.add(1300);

        System.out.println("Head value using Peek Funciton:" + pq.peek());
        Iterator<Integer> itr = pq.iterator();
        while(itr.hasNext()) System.out.println(itr.next());

        pq.poll();
        System.out.println("After removing  with poll function");

        Iterator<Integer> itr2 = pq.iterator();

        while(itr2.hasNext()) System.out.println(itr2.next());

        pq.remove(20);
        System.out.println("after removing 20 with remove function: ");

        Iterator<Integer> itr3 = pq.iterator();
        while(itr3.hasNext()) System.out.println(itr3.next());

        boolean b = pq.contains(10);
        System.out.println("Priority queue contains 10" + " or not?: " + b);

        Object[] arr = pq.toArray();
        System.out.println("Value to array: ");
        for(int i = 0;i<arr.length;i++)
            System.out.println("Value: " + arr[i].toString());
    }
}
