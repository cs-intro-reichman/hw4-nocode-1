public class Primes {
    public static void main(String[] args) {
        // Convert the first argument (args[0]) to an integer
        int n = Integer.parseInt(args[0]);    
        int sum = 0;
        int percentage = (sum/n) * 100;


        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum +=1;
                System.out.println(i);
                

            }
            
        }    

        System.out.println("There are " + sum + " primes between 2 and " + n + " (" + percentage + "% are primes)");

    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; 

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // If divisible, n is not prime
            }
        }
        return true; // If no divisors are found, n is prime
    }
}
