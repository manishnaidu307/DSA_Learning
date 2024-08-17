package Heaps;

public class insertDeleteHeap {
    
    private int [] Heap;
    private int maxSize;
    private int size;
    private static final int FRONT = 1;

    public insertDeleteHeap(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;

        Heap = new int[this.maxSize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos){
        return pos/2;
    }

    private int leftChild(int pos){
        return 2*pos;
    }

    private int rightChild(int pos){
        return (2*pos)+1;
    }

    private boolean isLeaf(int pos){
        if(pos > (size/2)) return true;

        return false;
    }
   
    private void swap(int fpos, int spos){

        int temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }

    private void minHeapify(int pos){
        if(!isLeaf(pos)){
            int swapPos = pos;

            if(rightChild(pos)<= size) 
                swapPos = Heap[leftChild(pos)] < Heap[rightChild(pos)]?leftChild(pos):rightChild(pos);
            else
                swapPos = leftChild(pos);

            if(Heap[pos]> Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]){
                swap(pos, swapPos);
                minHeapify(swapPos);
            }
        }
    }

    public void insert(int element){
        if(size>= maxSize) return;

        Heap[++size] = element;
        int current = size;
        while(Heap[current] < Heap[parent(current)]){
            swap(current , parent(current));
            current = parent(current);
        }
    }

    public void print(){
        for(int i = 1;i<= size/2;i++)
        {
            System.out.print(" Parent: " + Heap[i] + " Left child: " + Heap[2*i]
            + " Right child: " + Heap[2*i+1]);
            System.out.println();
        }
    }

    public int remove(){
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);

        return popped;
    }

    public static void main(String[] args){
        System.out.println("The Min Heap is");
        insertDeleteHeap minHeap = new insertDeleteHeap(8);
        minHeap.insert(2);
        minHeap.insert(5);
        minHeap.insert(7);
        minHeap.insert(8);
        minHeap.insert(9);
        minHeap.insert(1);
        minHeap.insert(3);

        minHeap.print();

        System.out.println("The Min value is: " + minHeap.remove());
    }
}