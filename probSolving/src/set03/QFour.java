package set03;

/** A prime number is a number that is divisible by only two numbers: 1 and itself. */

public class QFour {
    public static void main(String[] args) {
        var number = 17;

        // 2, 3, ,5, 7, 11, 13

        boolean status = isPrime(number);

        System.out.println(status);
    }

    public static boolean isPrime(int number) {
        var prime = !(number <= 1);


        for (int i = 2; i < number; i++) {
            if(number % i == 0) {
                prime = false;
                break;
            }
        }


        return prime;
    }
}
