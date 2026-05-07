class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create hm for lookup
        HashMap<Integer,Integer> targetMap = new HashMap<>();
        // iterate through our array
        for(int i=0; i<nums.length; i++){
            // create diff for each element in our hashmap
            int diff = target-nums[i];
            // conditional for if our key already exist on map
            if(targetMap.containsKey(diff)){
                return new int[]{targetMap.get(diff),i};
            }
            targetMap.put(nums[i],i);
        }
        return new int[]{};
    }

}
