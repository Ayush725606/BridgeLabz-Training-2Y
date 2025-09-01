import java.util.Scanner;

class MatrixTo1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = in.nextInt();
        System.out.print("Enter columns: ");
        int cols = in.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int[] arr = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[index++] = matrix[i][j];
            }
        }

        System.out.print("1D Array: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

        in.close();
    }
}