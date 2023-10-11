class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) return true;

            if (nums[l] == nums[m]) {
                l++;
                continue;
            }

            if (nums[l] <= nums[m]) {
                if (target >= nums[l] && target <= nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                if (target >= nums[m] && target <= nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return false;
    }
}