import java.util.Scanner;

class OddEvenArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = in.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) even[evenIndex++] = i;
            else odd[oddIndex++] = i;
        }

        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) System.out.print(odd[i] + " ");

        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) System.out.print(even[i] + " ");

        in.close();
    }
}