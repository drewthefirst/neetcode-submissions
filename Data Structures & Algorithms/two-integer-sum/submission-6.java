
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> targetMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(targetMap.containsKey(diff)){
                return new int[]{targetMap.get(diff),i};
            }
            targetMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
