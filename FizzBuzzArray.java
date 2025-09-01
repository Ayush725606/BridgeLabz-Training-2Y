import java.util.Scanner;

class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        String[] results = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) results[i] = "FizzBuzz";
            else if (i % 3 == 0) results[i] = "Fizz";
            else if (i % 5 == 0) results[i] = "Buzz";
            else results[i] = String.valueOf(i);
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        in.close();
    }
}