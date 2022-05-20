
import java.util.*;

class User {
    int id;
    int signin_time;
    int signout_time;

    User(String log_detail, String log_detail2) {
        this.id = Integer.valueOf(log_detail);
        this.signin_time = Integer.valueOf(log_detail2);
    }

    User(String log_detail) {
        this.signout_time = Integer.valueOf(log_detail);
    }

    public int getUserId() {
        return this.id;
    }

    public int getUsersigningtime() {
        return this.signin_time;
    }
}

public class Solution {
    public User[] log_user_array;

    public int maxuserID;

    Solution() {
        this.log_user_array = new User[1000];
        this.maxuserID = -1;
    }

    public static void main(String[] args) {
        String flush;
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of users:");
        option = sc.nextInt();
        String[] log = new String[option];
        User[] end_user = new User[option];
        flush = sc.nextLine();
        for (int i = 0; i < option; i++) {
            System.out.println("Enter the log_details:");
            log[i] = sc.nextLine();
        }
        Solution sol = new Solution();

        System.out.println(Arrays.toString(end_user));
        sc.close();

    }
}
