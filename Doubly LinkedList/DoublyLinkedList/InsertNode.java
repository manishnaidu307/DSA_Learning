package DoublyLinkedList;
class Node{
    int data;
    Node next;
    Node back;
    Node(int data1, Node next1, Node back1){
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
public class InsertNode {
    public static void main(String[] args) {
        int [] arr = {2,12,3,4};
        Node head = convert2DLL(arr);
        head = insertHead(head,3);
        LinkedListprint(head);
    }
    private static Node insertHead(Node head,int val){
        Node newNode = new Node(val,head,null);
        head.back = newNode;
        return newNode;
    }
    private static Node convert2DLL(int [] arr){
        Node temp = new Node(arr[0]);
        Node prev = temp;
        for(int i = 1;i<arr.length;i++){
            Node temp1 = new Node(arr[i],null,prev);
            prev.next = temp1;
            prev = temp1;
        }
        return temp;
    }
    private static void LinkedListprint(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    /*private static Node insertTail(Node head, int val){
        if(head.next == null) return insertHead(head, val);
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node prev = tail.back;
        Node newNode = new Node(val,tail,prev);
        prev.next = newNode;
        tail.back = newNode;
        return head;
    }
    private static Node insertKPos(Node head, int val , int k){
        if(k==1) return insertHead(head, val);
        int cnt = 0;
        Node temp = head;
        while(temp.next!=null){
            cnt++;
            if(cnt==k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val,temp,prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }
    private static void insertBeforeNode(Node node, int val){
        Node prev = node.back;
        Node newNode = new Node(val,node,prev);
        prev.next = newNode;
        node.back = newNode;
    }*/
}