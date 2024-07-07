package DoublyLinkedList;
class Node{
    int data;
    Node next;
    Node back;
    Node(int data1,Node next1,Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
};
public class ReverseDLL {
    public static void main(String[] args) {
        int [] arr = {2,3,5,6,7};
        Node head = convertDLL(arr);
        System.out.println("Before reversing: ");
        LinkedListprint(head);
        System.out.println("\nAfter reversing: ");
        Node rev = reverseDLL(head);
        LinkedListprint(rev);
    }
    private static Node convertDLL(int [] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp; 
        }
        return head;
    }
    private static Node reverseDLL(Node head){
        if(head==null || head.next == null) return head;
        Node prev = null;
        Node current = head;
        while(current!=null){
            prev = current.back;
            current.back = current.next;
            current.next = prev;
            current = current.back;
        }
        return prev.back; //this is the new head after reversing.
    }
    private static void LinkedListprint(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
