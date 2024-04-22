public class FibonacciNumber {
    public static void main(String args[]) {
       int n = 10; // Change n to calculate Fibonacci series up to a different number
        int a = 0, b = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        // Print the first two Fibonacci numbers
        System.out.print(a + ", " + b);

        // Calculate and print the rest of the Fibonacci series
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    
    }
}
