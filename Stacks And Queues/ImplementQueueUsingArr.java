public class ImplementQueueUsingArr {
    public static void main(String[] args) {
       queue q = new queue();
       q.push(2);
       q.push(4);
       q.push(9);
       q.push(1);
       q.printQueue();
       q.pop();
       System.out.println();
       q.printQueue();
       System.out.println("\nTop of the queue "+ q.top());
    }
}
class queue{
    int cnt = 0;
    int size = 4;
    int [] arr = new int[size];
    int n = arr.length;
    int front;
    int rear;
    void push(int x){
        if(cnt == n) System.out.println("Queue is full");
        arr[rear % n] = x;
        rear++;
        cnt++;
    }
    void pop(){
        if(cnt==0) System.out.println("Queue is empty");
        arr[front%n] = -1;
        front++;
        cnt--;
    }
    int top(){
        if(cnt==0) System.out.println("Queue is empty");
        return arr[front % n];
    }
    void printQueue(){
        for(int i = front;i<rear;i++){
            System.out.print(arr[i%n]+" ");
        }
    }
}
