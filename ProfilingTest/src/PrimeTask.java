public class PrimeTask {
    public static void main(String[] args) {
        int limit = 1000000;
        System.out.println("Counting primes up to " + limit + "...");
        long count = countPrimes(limit);
        System.out.println("Total primes found: " + count);
    }

    public static long countPrimes(int limit) {
        long count = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

