package Queue.QueueUsingArray;

import java.util.Scanner;

public class queueImplementationUsingArray {
    private int [] queue;
    private int front;
    private int rear;
    queueImplementationUsingArray(int size){
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    public void enqueue(int data){
        if(rear == queue.length-1){
            System.out.println("queue overflow");
        }else if(rear == -1 && front == -1){
            front = 0;
            queue[++rear] =data;
        }else{
            queue[++rear] =data;
        }
    }
    public void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("Queue underflow");
        }else if(front == rear){
            System.out.println("removed: "+ queue[front]);
            front = -1;
            rear = -1;
        }else{
            System.out.println("removed: "+ queue[front]);
            front++;
        }
    }
    public void peek(){
        if(front == -1 && rear == -1){
            System.out.println("queue is empty");
        }else{
            System.out.println("peek element: " + queue[front]);
        }
    }
    public void display(){
        if(rear == -1 && front == -1){
            System.out.println("Queue is empty");
        }else{
            for(int i = front; i<= rear ;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();

        }
        
    }
    public void isEmpty(){
        if(front == -1 && rear == -1){
            System.out.print("queue is empty");
        }else{
            System.out.print("Not empty");
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        queueImplementationUsingArray q = new queueImplementationUsingArray(5);
        q.enqueue(4);
        q.enqueue(7);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(4);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
        q.peek();
        return;
    }
    
    
}
