
//import java.util.*;

public class hello {
    public static void main(String[] args) {
        int a = 0, N = 5, i, j;
        for (i = 0; i < N; i++) {
            for (j = N; j > i; j--) {
                a = a + i + j;
            }
        }
        System.out.println(a);
    }
}
