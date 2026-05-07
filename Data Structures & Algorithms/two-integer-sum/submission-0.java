class Solution {
    public int[] twoSum(int[] nums, int target) {

        // loop through nums array for i
        for (int i = 0; i<nums.length; i++) {
            // loop through our nums array for j
            for(int j = i + 1; j < nums.length; j++){
                // compare for our target
                if (nums[i] + nums[j] == target){
                    return new int []{i,j};
                }
            }
        }
        return new int[0];
    }
}
