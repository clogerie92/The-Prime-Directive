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
        // create reader object to read user input
        Scanner reader = new Scanner(System.in);
        // prompt user to enter a number
        System.out.println("Please enter a number!");
        // store user input as userInput
        int userInput = reader.nextInt();
        // check if userInput is even or odd
        if(userInput % 2 == 0) {
            // print if userInput is even
            System.out.println("The number " + userInput + " is even!");
            // otherwise print userInput is odd
        } else {
            System.out.println("The number " + userInput + " is odd!");
        }
    }
    // printNPrimes()
    public ArrayList<Integer> printNPrimes(int x, int[] nums) {
        // create new ArrayList for prime numbers
        ArrayList<Integer> nPrime = new ArrayList<Integer>();
        // loop through nums array
        for(int j = 0; j < nums.length; j++) {
            // if number in nums array is prime add it to nPrime ArrayList
            if(isPrime(nums[j])) {
                // looping as many times as desired number of primes
                while(nPrime.size() < x) {
                    // add number in nums array to nPrime ArrayList
                    nPrime.add(nums[j]);
                }
            }
        }
        return nPrime;
    }

    // printNFibonacci()
    public ArrayList<Integer> printNFibonacci(int y) {
        // create new ArrayList for Fibonacci sequence
        ArrayList<Integer> nFib = new ArrayList<Integer>();
        // added starting numbers
        nFib.add(0);
        nFib.add(0);
        // if number is less than 2 return
        if(y < 2) {
            return nFib;
        }
        // loop through 2 and number in ArrayList
        for(int k = 2; k <= y; k++) {
            // get number in squence
           int sum = (k - 1) + (k - 2);
           // add number to ArrayList
           nFib.add(sum); 
        }
        return nFib;
    }

    // main method
    public static void main(String[] args) {
        // create new class
        PrimeDirective pd = new PrimeDirective();
        // numbers to test
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        // print statements
        System.out.println(pd.isPrime(11));
        System.out.println(pd.isPrime(100));
        System.out.println(pd.isPrime(101));
        System.out.println(pd.isPrime(43));
        System.out.println(pd.isPrime(89));
        System.out.println(pd.onlyPrime(numbers));
        System.out.println(pd.printNPrimes(3, numbers));
        System.out.println(pd.printNFibonacci(3));
        // call printEvenOrOdd on pd
        pd.printEvenOrOdd();
    }
}