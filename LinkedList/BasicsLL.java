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
public class BasicsLL {
    public static void main(String[] args) {
        int [] arr = {2,3,6,12,4};
        Node head = ConverLL(arr);
        PrintLL(head);
        if((SearchLL(head, 12))== true) 
        System.out.println("\npresent in the Linked List. ");
        else System.out.println("Element not present in the LL.");
    }
    public static Node ConverLL(int [] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        
        for(int i = 0;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void PrintLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static boolean SearchLL(Node head, int val){
        Node temp = head;
        while(temp!= null){
            if(temp.data == val) return true;
            temp = temp.next;
        }
        return false;
    }
}
