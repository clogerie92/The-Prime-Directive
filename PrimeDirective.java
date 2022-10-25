// import statement to use ArrayList
import java.util.ArrayList;
// PrimeDirective class
class PrimeDirective {
    // method to check if number is prime
    public boolean isPrime(int number) {
        // if number is 2 return true
        if(number == 2) {
            return true;\
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
    // main method
    public static void main(String[] args) {
        
    }
}