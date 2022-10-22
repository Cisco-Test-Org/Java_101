package set04;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        var string = "Java is a powerful general purpose programming language";

        var path = "/media/cisco/mdisk/dummy/output.txt";

        //writeFile(string, path);

        readFile(path);
    }

    public static void writeFile(String string, String path) {

        String[] array = string.split(" ");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (String item : array) {
                bw.write(item + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readFile(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
