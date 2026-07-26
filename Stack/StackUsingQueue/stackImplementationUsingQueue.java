package Stack.StackUsingQueue;

import java.util.*;

public class stackImplementationUsingQueue {
    Queue<Integer> queue;

    stackImplementationUsingQueue() {
        queue = new LinkedList<>();
    }

    public void push(int data){
        queue.offer(data);
        int size = queue.size();
        for(int i = 1 ; i < size  ;i++){
            queue.offer(queue.poll());
        }
    }
    public void pop(){
        if(queue.isEmpty()){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Removed: " + queue.poll());
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public void peek(){
        if(queue.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Peek element: "+ queue.peek());
    }
    public void display(){
        if(queue.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for(int num : queue){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        stackImplementationUsingQueue stackQueue = new stackImplementationUsingQueue();
        stackQueue.push(10);
        stackQueue.push(50);
        stackQueue.push(102);
        stackQueue.push(70);
        stackQueue.push(180);
        stackQueue.display();

    }

}
