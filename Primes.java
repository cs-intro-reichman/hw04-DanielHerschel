public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];
        int primeCount = 0;

        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) {
                primeCount++;
                for (int j = i*i; j <= n; j += i) {
                    isPrime[j] = true;
                }
                System.out.println(i);
            }
        }
        int percentage = primeCount * 100 / n;

        System.out.printf("There are %d primes between 2 and %d (%d%% are primes)%n", primeCount, n, percentage);
    }
}