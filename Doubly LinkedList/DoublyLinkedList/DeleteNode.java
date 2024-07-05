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

public class DeleteNode {
    public static void main(String[] args) {
        int arr [] = {1,3,4,5,6};
        Node head = array2DLL(arr);
        head = deleteHead(head);
        printNodes(head);
    
    }
    private static void printNodes(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    private static Node array2DLL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    private static Node deleteHead(Node head){
        if(head == null || head.next == null) return null;
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }
    // private static Node removeKElement(Node head, int k){
    //     if(k == 1) return null;
    //     int cnt = 0;
    //     Node knode = head;
    //     while(knode != null){
    //         cnt++;
    //         if(cnt == k) break;
    //         knode = knode.next;
    //     }
    //     Node prev = knode.back;
    //     Node front = knode.next;
    //     if(prev == null && front == null) return null;
    //     else if (prev == null) return deleteHead(head);
    //     else if(front == null) return deleteTail(head);
    //     prev.next = front;
    //     front.back = prev;
    //     knode.back = null;
    //     knode.next = null;
    //     return head;
    // }
    // private static Node deleteTail(Node head) {
    //     if (head == null || head.next == null) {
    //         return null; // Return null if the list is empty or contains only one element
    //     }
            
    //     Node tail = head;
    //     while (tail.next != null) {
    //             tail = tail.next;
    //     }
            
    //     Node newtail = tail.back;
            
    //     newtail.next = null;
    //     tail.back = null;
            
    //     return head;
    // }
    // @SuppressWarnings("null")
    // private static void deleteGivenNode(Node temp){
    //     Node prev = temp.back;
    //     Node front = temp.next;
    //     if(front == null){
    //         prev.next = null;
    //         front.back = null;
    //         return;
    //     }
    //     prev.next = front;
    //     temp.back = prev;
    //     temp.next = temp.back= null;
    // }
}
