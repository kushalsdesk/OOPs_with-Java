//FInds the index position of the largest number in an array

package session3;

class exercise1 {
    public static void main(String[] args) {
        int[] votes = { 1, 2, 34, 56, 6, 7, 8, 9, 10, 11, 12, 13, 14, 150 };
        int userWithMostVotes = mostvotes(votes);
        System.out.println("User with most votes: " + userWithMostVotes);
    }

    public static int mostvotes(int[] votesPerUser) {
        int large = votesPerUser[0];
        int index = 0;
        for (int i = 1; i < votesPerUser.length; i++) {
            if (large < votesPerUser[i]) {
                large = votesPerUser[i];
                index = i;
            }
        }

        return index;

    }
}
