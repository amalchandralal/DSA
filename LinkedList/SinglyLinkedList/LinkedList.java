package LinkedList.SinglyLinkedList;

public class LinkedList {
    node head;
    void insertAtBegining(int data){
        //creation of new node
        node newNode = new node(data);
        //checking head is empty or not
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }
    void insertAtEnd(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    void insertAtSpecificPoint(int position,int data){
        node newNode = new node(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        node temp = head;
        for(int i=1 ; i < (position-1) && temp != null ; i++ ){
            temp = temp.next;
        }
        if(temp == null){
            System.out.print("Invalid position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return;
    }
    void deleteFromBegining(){
        if(head == null){
            System.out.print("Empty LinkedList");
            return;
        }
        head = head.next;
        return;
    }
    void deleteFromLast(){
        if(head == null){
            System.out.print("Empty");
            return;
        }
        
        if(head.next == null){
            head = null;
        }
        node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return;
    }
    void deleteFromSpecificPoint(int position){
        if(head == null){
            System.out.print("Empty");
        }
        if(position == 1){
            head = head.next;
            return;
        }
        node temp = head;
        for(int i = 1; i < (position-1) && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.print("Invalid Position");
            return;
        }

        temp.next = temp.next.next;
        return;
    }
    void deleteByValue(int value){
        if(head == null){
            System.out.print("Empty");
            return;
        }
        if(head.data == value){
            head = null;
            return;
        }
        node temp = head;
        while(temp.next != null && temp.next.data != value){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.print("Value not found");
            return;
        }
        temp.next = temp.next.next;
    }
    void reverse(){
        node prev = null;
        node current = head;
        node next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }
    void display(){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
    }
}