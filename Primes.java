public class Primes {
    public static void main(String[] args) {
        // Convert the first argument (args[0]) to an integer
        int n = Integer.parseInt(args[0]);    
        int sum = 0;

        System.out.println("Prime numbers up to " +n+":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum +=1;
                System.out.println(i);
            }
            
        }    
        System.out.println("There are " + sum + " primes between 2 and " + n + " (" + (int)(sum*100.0)/n + "% are primes)");

    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; 

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
