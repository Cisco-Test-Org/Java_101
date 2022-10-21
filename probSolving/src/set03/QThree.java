package set03;
/** reverse a number */
public class QTwo {
    public static void main(String[] args) {
        var number = 1234;
        reverse(number);
    }
    static void reverse(int number) {
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        sb.reverse();
        Integer reversedNumber = Integer.valueOf(sb.toString());
        System.out.println(reversedNumber);
    }
}
