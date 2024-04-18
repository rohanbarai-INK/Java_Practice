public class PrimeNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 13, 15};
        printPrimes(numbers);
    }

    public static void printPrimes(int[] arr) {
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
