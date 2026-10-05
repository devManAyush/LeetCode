class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int balance = 0;
        for (int value : nums) {
            if (balance == 0) {
                candidate = value;
            }
            if (value == candidate) {
                balance++;
            } else {
                balance--;
            }
        }
        return candidate;
    }
}
class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2, 3, 3, 1, 3, 3};
        Solution sol = new Solution();
        System.out.println(sol.majorityElement(nums));
    }
}
