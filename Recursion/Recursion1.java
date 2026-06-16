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
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void printFibRecursion(int first, int second, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(first + " ");
        int next = first + second;
        printFibRecursion(second, next, n - 1);

    }

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        return x * calcPower(x, n - 1);
    }

    public static double Pow(int x, int n) {
        if (x == 0)
            return 0.0;
        if (x == 1)
            return 1.0;
        if (n == 0)
            return 1.0;
        if (n == -1 && n % 2 == 0)
            return 1.0;
        if (n == -1 && n % 2 != 0)
            return -1.0;

        long binary = n;
        if (x < 0) {
            x = 1 / x;
            binary = -binary;
        }
        double ans = 1;
        while (binary > 0) {
            if (binary % 2 == 1) {
                ans *= x;
            }
            x *= x;
            binary /= 2;
        }
        return ans;

    }

    public static void PrintFib(int first, int second, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(first + " ");
        PrintFib(second, first + second, n - 1);
    }

    public static void TowerOfHanoi(int n, String source, String helper, String destination) {

        if (n == 1) {
            System.out.println("Disk " + n  + " moved from " + source + " to " + destination);
            return;

        }

        TowerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Disk " + n  + " moved from " + source + " to " + destination);
        TowerOfHanoi(n-1, helper, source, destination);
    }

    public static void main(String args[]) {
        Recursion1 recursion = new Recursion1();
        // recursion.printFromFiveToOne(5);
        // recursion.printSum(1,5,0);
        // System.out.println(recursion.factorial(5));
        // System.out.println(recursion.Pow(2,3 ));
        // recursion.PrintFib(0, 1, 5);
        recursion.TowerOfHanoi(3, "Source","Helper", "Destination");

    }

}
