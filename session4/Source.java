package session4;

// This program shows the sum of the total sum of lines with Abstraction
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Source {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLineCoordinates = br.readLine().split(" ");
        int a1 = Integer.parseInt(firstLineCoordinates[0]);
        int b1 = Integer.parseInt(firstLineCoordinates[1]);
        String[] secondLineCoordinates = br.readLine().split(" ");
        int a2 = Integer.parseInt(secondLineCoordinates[0]);
        int b2 = Integer.parseInt(secondLineCoordinates[1]);

        Line firstLine = new Line(a1, b1);
        Line secondLine = new Line(a2, b2);

        int totalSumOfLines = getTotalSumOfLines(firstLine, secondLine);
        System.out.println(totalSumOfLines);

        br.close();
    }

    private static int getTotalSumOfLines(Line firstLine, Line secondLine) {

        // Write the code to complete this method
        int firstLineA = firstLine.getA();
        int firstLineB = firstLine.getB();
        int firstLineLength = 0;
        int secondLineLength = 0;
        if (firstLineA < firstLineB) {
            firstLineLength = firstLineB - firstLineA;

        } else {
            firstLineLength = firstLineA - firstLineB;
        }
        int secondLineA = secondLine.getA();
        int secondLineB = secondLine.getB();
        if (secondLineA < secondLineB) {
            secondLineLength = secondLineB - secondLineA;
        } else {
            secondLineLength = secondLineA - secondLineB;
        }
        System.out.println("First line length is: " + firstLineLength);
        System.out.println("Second line length is: " + secondLineLength);
        return firstLineLength + secondLineLength;

    }

    public static class Line {
        private int a;
        private int b;

        public Line(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }
}