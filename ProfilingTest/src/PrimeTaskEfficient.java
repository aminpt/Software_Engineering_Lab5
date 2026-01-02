public class PrimeTaskEfficient {
    public static void main(String[] args) {
        int limit = 1000000;
        System.out.println("Counting primes up to " + limit + " (Optimized)...");
        long count = countPrimes(limit);
        System.out.println("Total primes found: " + count);
    }

    public static long countPrimes(int limit) {
        if (limit < 2) return 0;
        long count = 1;
        for (int i = 3; i <= limit; i += 2) {
            if (isPrimeOptimized(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrimeOptimized(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int boundary = (int) Math.sqrt(n);
        for (int i = 3; i <= boundary; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}