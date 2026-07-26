package Queue.QueueUsingLinkedList;


public class queueImplementationUsingLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    private Node front;
    private Node rear;
    queueImplementationUsingLinkedList(){
        front = null;
        rear = null;
    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public void dequeue(){
        if(front == null){
            System.out.println("underflow...");
            return;
        }
        System.out.println("Removed: "+front.data);
        front= front.next;
    }
    public int peek(){
        if(front == null && rear == null){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
    public boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }
    public void display(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        queueImplementationUsingLinkedList q = new queueImplementationUsingLinkedList();
        q.enqueue(3);
        q.enqueue(44);
        q.enqueue(2);
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        q.dequeue();
        System.out.println(q.peek());
        q.display();

    }
    
}
