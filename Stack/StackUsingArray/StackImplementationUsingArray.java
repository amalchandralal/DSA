package Stack.StackUsingArray;
import java.util.*;

/**
 * StackImplementationUsingArray
 */
public class StackImplementationUsingArray {
    static int size;
    static int [] stack ;
    static int top = -1;

    static void push(int value){
        if(top == size-1){
            System.out.println("Stack overflow");

        }else{
            top++;
            stack[top] =  value;
            System.out.println("Inserted "+value+" into the stack");
        }

    }
    static void pop(){
        if(top == -1){
            System.out.println("Stack underflow");
        }else{
            int item = stack[top];
            top--;
            System.out.println("Deleted " + item + " from the stack");
        }

    }
    static void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("top element is " + stack[top]);
        }

    }
    static void display(){
        for(int i = top ; i >= 0 ;i--){
            System.out.print(stack[i] + " ");
        }

    }
    static boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    static boolean isFull(){
        if(top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        size = sc.nextInt();
        stack = new int[size];
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        pop();
        peek();
        display();
        


    }
}