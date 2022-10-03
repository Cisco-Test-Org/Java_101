package set02;

/** camel case words finder */

public class QThree {
    public static void main(String[] args) {
        String string = "saveChangesInTheEditor";

        int count = camelCae(string);

        System.out.println(count);
    }

    public static int camelCae(String string) {
        int count = 1;

        for (int i = 0; i < string.length(); i++) {
            count = (Character.isUpperCase(string.charAt(i)))
                    ? count + 1
                    : count;
        }

        return count;
    }
}
