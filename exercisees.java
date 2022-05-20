
/**
 * exercisees
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class exercisees {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_ch = br.readLine().split(" ");
        char[] ch = new char[N];
        for (int i_ch = 0; i_ch < arr_ch.length; i_ch++) {
            ch[i_ch] = arr_ch[i_ch].charAt(0);
        }

        String out_ = solve(N, ch);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static String solve(int N, char[] ch) {
        // Write your code here
        String result = "";
        for (int i = 0; i < ch.length; i++) {
            result = result + ch[i];
        }
        return result;
    }
}