import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        for (int num : nums) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is Positive Even");
                else
                    System.out.println(num + " is Positive Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        if (nums[0] == nums[nums.length - 1])
            System.out.println("First and last elements are Equal");
        else if (nums[0] > nums[nums.length - 1])
            System.out.println("First element is Greater than last");
        else
            System.out.println("First element is Less than last");

        in.close();
    }
}