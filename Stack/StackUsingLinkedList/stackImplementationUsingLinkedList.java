package Stack.StackUsingLinkedList;

/**
 * stackImplementationUsingLinkedList
 */
public class stackImplementationUsingLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node top;
    stackImplementationUsingLinkedList(){
        top = null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }
    public void pop(){
        if(top == null){
            System.out.println("Underflow");
            return;
        }
        System.out.println("Removed: "+top.data);
        top = top.next;
    }
    public int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }
    public void display(){
        if(top == null){
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        stackImplementationUsingLinkedList s = new stackImplementationUsingLinkedList();
        s.push(33);
        s.push(35);
        s.push(37);
        s.push(32);
        s.display();
        s.pop();
        s.display();
        System.out.println("peek element: " + s.peek());

    }
}