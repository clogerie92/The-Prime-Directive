// import statement to use ArrayList
import java.util.ArrayList;
// PrimeDirective class
class PrimeDirective {
    // method to check if number is prime
    public boolean isPrime(int number) {
        // if number is 2 return true
        if(number == 2) {
            return true;
          // if number is less than 2 return false  
        } else if(number < 2) {
            return false;
        }
        // loop through numbers between 2 and given number
        for(int i = 2; i < number; i++) {
            // if number is divisible by i return false
            if(number % i == 0) {
                return false;
            }
        }
        // otherwise return true
        return true;
    }
    // onlyPrime method to return numbers that are prime
    ArrayList<Integer> onlyPrime(int[] numbers) {
        // primes ArrayList
        ArrayList<Integer> primes = new ArrayList<Integer>();
        // loop through each number is primes ArrayList to determine if prime
        for(int number : numbers) {
            // check if number is prime with isPrime method
            if(isPrime(number)) {
                // add prime number to primes ArrayList
                primes.add(number);
            }
        }
        return primes;
    } 
    // main method
    public static void main(String[] args) {
        
    }
}