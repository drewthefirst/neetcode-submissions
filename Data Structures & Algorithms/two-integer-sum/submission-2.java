class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create new hashmap to store value and index for each element
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        // for loop, needs indexing
        for (int i = 0; i<nums.length; i++){
        hm1.put(nums[i], i);
        }
        for (int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if(hm1.containsKey(complement) && hm1.get(complement) != i) {
                return new int[]{i, hm1.get(complement)};
            }
        }
        return new int[0];
    }
}
