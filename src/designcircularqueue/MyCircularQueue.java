package src.designcircularqueue;

public class MyCircularQueue {

    private final int[] arr;

    private int size;
    private int rear;
    private int front;

    public MyCircularQueue(int k) {
        arr = new int[k];
        size = 0;
        rear = 0;
        front = 0;
    }

    public boolean enQueue(int value){
        if(isFull()){
            return false;
        }
        arr[rear % arr.length] = value;
        rear++;
        size++;

        return true;
    }

    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        front++;
        size--;
        return true;
    }

    public int Front(){
        if(isEmpty()){
            return -1;
        }
        return arr[front % arr.length];
    }

    public int Rear(){
        if(isEmpty()){
            return -1;
        }
        return arr[(rear - 1) % arr.length];
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public boolean isFull(){
        return size == arr.length;
    }





}
