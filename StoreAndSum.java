import java.util.Scanner;

class StoreAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == 10) break;
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = in.nextDouble();
            if (num <= 0) break;
            arr[index] = num;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum = " + total);
        in.close();
    }
}