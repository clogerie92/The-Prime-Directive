// import statement to use ArrayList and Scanner
import java.util.ArrayList;
import java.util.Scanner;
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
    // printEvenOrOdd method to print even or odd to the console
    public void printEvenOrOdd() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number!");

        int userInput = reader.nextInt();
        if(userInput % 2 == 0) {
            System.out.println("The number " + userInput + " is even!");
        } else {
            System.out.println("The number " + userInput + " is odd!");
        }
    }

    // main method
    public static void main(String[] args) {
        // create new class
        PrimeDirective pd = new PrimeDirective();
        // numbers to test
        int[] numbers = {11, 100, 101, 43, 89};
        // print statements
        System.out.println(pd.isPrime(11));
        System.out.println(pd.isPrime(100));
        System.out.println(pd.isPrime(101));
        System.out.println(pd.isPrime(43));
        System.out.println(pd.isPrime(89));
        System.out.println(pd.onlyPrime(numbers));
        pd.printEvenOrOdd();
    }
}