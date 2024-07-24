class Stack{
    int size = 10000;
    int [] arr = new int[size];
    int top = -1;
    void push(int x){
        arr[++top] = x;
    }
    int pop(){
        int x = arr[top];
        top--;
        return x;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top +1;
    }
    boolean isEmpty(){
        return (top == -1);
    }
}
public class ImplementStackUsingArr {
public static void main(String[] args) {
    Stack s = new Stack();
    s.push(4);
    s.push(8);
    s.push(10);
    System.out.println("Top element is:" + s.top());
    System.out.println("Top element after popping is: "+ s.pop());
    System.out.println("Size of stack:" + s.size());
    System.out.println("Stack empty or not:"+ s.isEmpty());
}
    
}