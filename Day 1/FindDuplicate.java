import java.util.Arrays;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int x = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                x = nums[i];
                break;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        FindDuplicate solution = new FindDuplicate();
        int[] nums = {3, 1, 3, 4, 2};
        int duplicate = solution.findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicate);
    }
}
