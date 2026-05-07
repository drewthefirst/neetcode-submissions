/*
INTUITION
    find a pair of elements that add to the target value
    quickest way -> walk through test case
    target = 7 - value at given index = 3
    we should check if our nums array contains 4 the difference
    yes return the indices
    utilize hashMap for quick lookup - most efficient
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> sumMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(sumMap.containsKey(diff)){
                return new int[]{sumMap.get(diff),i};
            }
            sumMap.put(nums[i], i); // add element to our map; key:element at index value: index
        }
        return new int[]{};
    }
}
