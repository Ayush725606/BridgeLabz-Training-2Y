import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = in.nextInt();
            if (ages[i] < 0) {
                System.out.println("Invalid age entered.");
                return;
            }
        }

        for (int age : ages) {
            if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
        in.close();
    }
}