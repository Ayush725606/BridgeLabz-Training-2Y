import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter 11 heights:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = in.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean height = " + mean);
        in.close();
    }
}