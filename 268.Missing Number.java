public class Solution{

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;

        // Subtract all array elements from total
        for (int num : nums) {
            total -= num;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int missing = missingNumber(nums);

        System.out.println("Missing number: " + missing);

        sc.close();
    }
}
