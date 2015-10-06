import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by halturin_a on 06.10.2015.
 */
public class Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] sChars = s.toCharArray();
        int a;
        StringBuilder sb = new StringBuilder();
        char[] infiniteChars;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            sb.append(i);
            infiniteChars = sb.toString().toCharArray();
            a = sb.toString().indexOf(s);
            if (a != - 1) {
                System.out.println(a + 1);
                break;
            }
        }

    }
}
