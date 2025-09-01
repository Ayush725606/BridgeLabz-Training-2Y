import java.util.Scanner;

class Multiplication6to9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 6 and 9: ");
        int number = in.nextInt();

        if (number < 6 || number > 9) {
            System.out.println("Invalid input");
            return;
        }

        int[] result = new int[10];
        for (int i = 0; i < 10; i++) {
            result[i] = number * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + result[i]);
        }

        in.close();
    }
}