package Queue.QueueUsingArray;

import java.util.Scanner;

public class queueImplementationUsingArrya {
    static int[]queue;
    static int size;
    static int rear = -1;
    static int front = -1;
    //check three things 1.queue is full? 2. both front and rear is -1? 3. both them are not -1?
    static void enquue(int value){
        if(rear >= size-1 ){
            System.out.println("overflow");
        }else if(front == -1 && rear == -1){
            front = rear = 0;
            queue[front]=value;
        }else{
            rear++;
            queue[rear]=value;
        }
    }
    static void dequeue(){
        if(rear == -1 && front == -1){
            System.out.println("underflow");
        }else if(front == rear){
            System.out.println("Dequeued element is "+queue[front]);
            front = rear = -1;
        }
        else{
            System.out.println("Dequeued element is "+queue[front]);
            front++;
        }
    }
    static void display(){
        if(rear == -1 && front == -1){
            System.out.println("Queue is empty");
        }else{
            for(int i = front; i < rear;i++){
                System.out.print(queue[i]+" ");
            }
        }
    }
    static void peek(){
        if(rear == -1 && front == -1){
            System.out.println("Queue is empty");
        }else{
            System.out.println(queue[front]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of queue");
        size = sc.nextInt();
        queue = new int[size];
    }
    
}
