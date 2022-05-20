package session5;

public class ArrayBuilder {
    public static int[] getArray(int a, int b) {
        int[] array = { a, b };
        return array;
    }

    public static int[] getArray(int a, int b, int c) {
        int[] array = { a, b, c };
        return array;
    }

    public static int[] getArray(int a, int b, int c, int d) {
        return new int[] { a, b, c, d, };
    }
}

class Main {
    public static void main(String[] args) {
        int[] arr = ArrayBuilder.getArray(10, 20, 30, 40);
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}