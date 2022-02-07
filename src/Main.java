import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
public static void main (String[] args) {
    StringBuilder builder = new StringBuilder();
    try {
        BufferedReader BR = new BufferedReader(new FileReader("data/Anekdot.txt"));
        for (; ; ) {
            String line = BR.readLine();
            if (line == null) {
                break;
            }
            builder.append(line + "\n");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    System.out.println(builder.toString());
}
}