public class PrimeNumber {
    // Check if a given number is prime or not
    public static boolean isPrime(int num){
        //Implement the logic here
    }
    public static void main(String[] args) {
        int number = 19;
        boolean isPrime = true;
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        System.out.println(number + " is " + (isPrime? "prime" : "not prime"));
    }
}
