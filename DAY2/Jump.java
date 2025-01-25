 class two {
    public int jump(int[] nums) {
        int jumps = 0, currentEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        two solution = new two();
        int[] nums = {2, 3, 1, 1, 4};
        int result = solution.jump(nums);
        System.out.println("Minimum jumps required: " + result);
    }
}
