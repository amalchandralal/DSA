package Recursion;

public class Recursion1 {
    public static void printFromFiveToOne(int number) {
        if (number == 0) {
            return;
        }
        System.out.println(number);
        printFromFiveToOne(number - 1);
    }

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += n;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
        System.out.println(i);
    }

    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void printfib(int n) {
        int first = 0;
        int second = 1;
        for(int i=0;i<n;i++){
            System.out.print(first+" ");
            int next = first+second;
            first = second;
            second = next;
        }
    }
    public static void printFibRecursion(int first,int second,int n){
        if(n==0){
            return;
        }
        System.out.print(first + " ");
        int next = first+second;
        printFibRecursion(second,next, n-1);
        
    }

    public static void main(String args[]) {
        Recursion1 recursion = new Recursion1();
        // recursion.printFromFiveToOne(5);
        // recursion.printSum(1,5,0);
        // System.out.println(recursion.factorial(5));
        recursion.printFibRecursion(0,1,5);

    }

}
