package session3;

public class exercise4 {
    public static void main(String[] args) {
        double[] array = { 10.32, 20.36, 30.50, 40.51, 50.49, 60.43, 71.71 };
        int i = 0;
        while (i < array.length) {
            array[i] = Math.round(array[i]);
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

    }

    /*
     * static void print_arr(double[] arr) {
     * for (int i = 0; i < arr.length; i++) {
     * System.out.print(arr[i] + " ");
     * }
     * System.out.println();
     * }
     */

}
