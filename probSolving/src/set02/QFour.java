package set02;

import java.util.Arrays;

/** find the most repeated word in a sentence */

public class QFour {
    public static void main(String[] args) {
        String sentence = "how to go to school without knowing how to ride a bicycle ";
        String most = mostRepeated(sentence);
        System.out.println(most);
    }

    public static String mostRepeated(String sentence) {
        String most = "";
        String[] sentArray = sentence.split("\\s");

        System.out.println(Arrays.toString(sentArray));

        // [how, to, go, to, school, without, knowing, how, to, ride, a, bicycle]

//        for (int i = 0; i < sentArray.length; i++) {
//            for (int j = 1; j < sentArray.length; j++) {
//                if(sentArray[i] == sentArray[j]) {
//
//                }
//            }
//        }


        return most;
    }
}
