package set01;


/** Most frequent element in an array */

public class QOne {
    public static void main(String[] args) {
        int[] list = {1,2,1,3,2,1,2,2,3,4};
        findMaxVal(list);
    }

    static void findMaxVal(int[] list) {
        
        int max_count = 0;

        int most_frequent = 0;

        for (int i = 0; i < list.length; i++) {
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) count++;
            }

            if(count > max_count) {
                max_count = count;
                most_frequent = list[i];
            }
        }

        System.out.println("most frequent num is : " + most_frequent);

    }

}
