import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] croatiaAlphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for(String val : croatiaAlphabet) {
            str = str.replace(val, "A");
        }

        System.out.println(str.length());
        br.close();
    }
}
