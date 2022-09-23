package set03;

/** prime numbers */

// A prime number can be divided, without a remainder, only by itself and by 1.
// Zero and 1 are not considered prime numbers.
// The only even prime number is 2. All other even numbers can be divided by 2.

public class QOne {
    public static void main(String[] args) {
        var number = 5;
        checkPrimeNumber(1);
    }

    static void checkPrimeNumber(int number) {
        boolean isPrime = false;
        if(number == 2) {
            isPrime = true;
        }
        if(number == 1) {
            isPrime = false;
        } else if ((number * number - 1) % 24 == 0) {
            isPrime = true;
        }

        System.out.println(isPrime);
    }
}

