class Solution {
    public int search(int[] nums, int target) {
        int head = 0; int tail = nums.length - 1;

        while (head <= tail){
            // calc middle value
            int mid = (head + tail)/2;
            if (target == nums[mid]){
                return mid;
            } else if (target > nums[mid]){
                // remove right - reassign tail end
                head = mid + 1;
            } else {
                tail = mid - 1;
            } 
        }
        return -1;
    }
}
