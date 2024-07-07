package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
};
public class ReverseLinkedList {
public static void main(String[] args) {
    int [] arr = {2,4,5,7,8};
    Node head = convertLL(arr);
    Node newRev = ReverseIterative(head);
    Node newRev1 = ReverseRecursive(head);
}
   private static Node convertLL(int [] arr){
    Node head = new Node(arr[0]);
    Node mover = head;
    for(int i = 1; i<arr.length;i++){
        Node temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
    }
    return head;
   }
   private static Node ReverseIterative(Node head){
    if(head == null || head.next == null) return head;
    Node temp = head;
    Node prev = null;
    while(temp!=null){
        Node front = temp.next;
        temp.next = prev;
        prev = temp;
        temp = front;
    }
    return prev;
   }
   private static Node ReverseRecursive(Node head){
    if(head == null || head.next == null) return head;
    Node newHead = ReverseRecursive(head.next);
    Node front = head.next;
    front.next = head;
    head.next = null;
    return newHead;
   } 
}